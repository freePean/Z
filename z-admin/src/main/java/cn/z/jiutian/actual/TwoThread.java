package cn.z.jiutian.actual;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 两个线程交替执行打印 1~100
 */
public class TwoThread {

   private int start = 1;
   
   /*
    * 保证内存可见性
     * 其实用锁了之后也可以保证可见性 这里用不用 volatile 都一样
    */
   private boolean flag = false;

   /**
    * 重入锁
    */
   private final static Lock LOCK = new ReentrantLock();
   
   public static void main(String[] args) {
      TwoThread twoThread = new TwoThread();
      
      Thread t1 = new Thread(new OuNum(twoThread));
      t1.setName("t1");
      
      Thread t2 = new Thread(new JiNum(twoThread));
      t2.setName("t2");
      
      t1.start();
      t2.start();
   }
   
   /**
    * 偶數線程
    */
   public static class OuNum implements Runnable{
     
    private TwoThread number;
     
    public OuNum(TwoThread number) {
        // TODO Auto-generated constructor stub
        this.number = number;
    }
    
    @Override
    public void run() {
        // TODO Auto-generated method stub
        while(number.start <= 100){
             if(number.flag){
                 try {
                    LOCK.lock();
                    System.out.println(Thread.currentThread().getName() + "+-+" + number.start);
                    number.start++;
                    number.flag = false;
                } finally{
                    LOCK.unlock();
                }
             }else{
                 try {
                    Thread.sleep(10);
                } catch (Exception e) {
                    // TODO: handle exception
                    e.printStackTrace();
                }
             }
        }
    }
   }
   
   /*
    * 奇數線程
    */
   public static class JiNum implements Runnable{
    private TwoThread number;
    
    public JiNum(TwoThread number) {
        this.number = number;
    }
    
    
    @Override
    public void run() {
        while(number.start <= 100 ){
            if(!number.flag){
                try {
                    LOCK.lock();
                    System.out.println(Thread.currentThread().getName() + "+-+" + number.start);
                    number.start++;
                    number.flag = true;  
                } finally{
                    LOCK.unlock();
                }
            }else{
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                    // TODO: handle exception
                    e.printStackTrace();
                }
            }
        }
    }
   }
}
