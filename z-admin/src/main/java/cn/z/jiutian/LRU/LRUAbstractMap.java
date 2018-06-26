//package cn.z.jiutian.LRU;
//
//import java.util.concurrent.ArrayBlockingQueue;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.ThreadFactory;
//import java.util.concurrent.ThreadPoolExecutor;
//import java.util.concurrent.TimeUnit;
//import java.util.concurrent.atomic.AtomicInteger;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import com.google.common.util.concurrent.ThreadFactoryBuilder;
//
///*
// * https://crossoverjie.top/2018/04/07/algorithm/LRU-cache/
// */
//public class LRUAbstractMap extends java.util.AbstractMap{
//
//    private static final Logger LOG = LoggerFactory.getLogger(LRUAbstractMap.class);
//
//    /*
//     * 检查是否线程超时
//     */
//    private ExecutorService checkTimePool;
//
//    /*
//     * map 最大size
//     */
//    private final static int MAX_SIZE = 1024;
//
//    private final static ArrayBlockingQueue<Node> QUEUE = new ArrayBlockingQueue<>(MAX_SIZE);
//
//    /*
//     * 默认大小
//     */
//    private final static int DEFAULT_ARRAY_SIZE = 1024;
//
//    /*
//     * 数组长度
//     */
//    private int arraySize;
//
//    /*
//     * 数组
//     */
//    private Object[] arrays;
//
//    /*
//     * 判断是否停止 flag
//     */
//    private volatile boolean flag = true;
//
//    /*
//     * 超时时间
//     */
//    private final static Long EXPIRE_TIME = 60*60*1000L;
//
//    /*
//     * 整个 map 的大小
//     */
//    private volatile AtomicInteger size;
//
//
//    public LRUAbstractMap() {
//        // TODO Auto-generated constructor stub
//        arraySize = DEFAULT_ARRAY_SIZE;
//        arrays = new Object[arraySize];
//
//        executeCheckTime();
//    }
//
//    /*
//     * 开启一个线程检查最先放入队列的值是否超时 设置为守护线程
//     */
//    private void executeCheckTime(){
//        ThreadFactory namedThreadFactory = new ThreadFactoryBuilder().setNameFormat("check-thread-%d").setDaemon(true).build();
//
//        checkTimePool = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MICROSECONDS, new ArrayBlockingQueue<>(1), namedThreadFactory, new ThreadPoolExecutor.AbortPolicy());
//        checkTimePool.execute(new CheckTimeThread());
//    }
//
//    @Override
//    public Object remove(Object key) {
//        // TODO Auto-generated method stub
//        int hash = hash(key);
//        int index = hash % arraySize;
//
//        Node currentNode = (Node) arrays[index];
//
//        if(currentNode == null){
//            return null;
//        }
//
//        if(currentNode.key ==  key){
//            sizeDown();
//
//            arrays[index] = null;
//
//            QUEUE.poll();
//            return currentNode;
//        }
//
//        return super.remove(key);
//    }
//
//    private void sizeDown(){
//        if(QUEUE.size() == 0 ){
//            flag = false;
//        }
//
//        this.size.decrementAndGet();
//    }
//
//    public int hash(Object key){
//        int h;
//        return (key ==  null)?0 : (h = key.hashCode())^(h >>> 16);
//    }
//
//    private class Node{
//        private Node next;
//        private Node pre;
//        private Object key;
//        private Object val;
//        private Long updateTime;
//
//        public Node(Node pre, Node next, Object key, Object val) {
//            // TODO Auto-generated constructor stub
//            this.pre = pre;
//            this.next = next;
//            this.key = key;
//            this.val = val;
//            this.updateTime = System.currentTimeMillis();
//        }
//
//        public Long getUpdateTime() {
//            return updateTime;
//        }
//        public void setUpdateTime(Long updateTime) {
//            this.updateTime = updateTime;
//        }
//
//        @Override
//        public String toString() {
//            // TODO Auto-generated method stub
//            return "Node{" + "key=" + key + ", val=" + val + '}';
//        }
//    }
//
//    private class CheckTimeThread implements Runnable{
//        @Override
//        public void run() {
//            // TODO Auto-generated method stub
//            while(flag){
//                try {
//                    Node node = QUEUE.poll();
//                    if(node ==  null){
//                        continue;
//                    }
//
//                    Long updateTime = node.getUpdateTime();
//                    if((updateTime - System.currentTimeMillis()) >= EXPIRE_TIME){
//                        remove(node.key);
//                    }
//                } catch (Exception e) {
//                    LOG.error("InterruptedException");
//                }
//            }
//        }
//    }
//}
