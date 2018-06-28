package cn.z.jiutian.threads;

import java.io.RandomAccessFile;
import java.util.concurrent.CountDownLatch;

import sun.misc.Contended;

public class ReadThread extends Thread{

    private final int BUFF_LEN = 256;
    
    //定义读取的起始点
    private long start;
    
    //定义读取的结束点
    private long end;
    
    //将读取到的字节输出到raf中  randomAccessFile可以理解为文件流，即文件中提取指定的一部分的包装对象 
    private RandomAccessFile raf;
    
    //线程中需要指定的关键字
    private String keywords;
    
    //此线程读到关键字的次数
    private int curCount = 0;
    
    /** 
     * jdk1.5开始加入的类，是个多线程辅助类 
     * 用于多线程开始前统一执行操作或者多线程执行完成后调用主线程执行相应操作的类 
     */
    private CountDownLatch doneSignal;
    
    public ReadThread(long start, long end, RandomAccessFile raf, String keywords, CountDownLatch doneSignal) {
        // TODO Auto-generated constructor stub
        this.start = start;
        this.end = end;
        this.raf = raf;
        this.keywords = keywords;
        this.doneSignal = doneSignal;
    }
    
    @Override
    public void run() {
        try {
            raf.seek(start);
            
            //本线程负责读取文件的大小
            long currentLen = end - start;
            
            //定义最多需要读取几次就可以完成本线程的读取
            long times = currentLen/BUFF_LEN + 1;
            
            System.out.println(this.toString() + "需要读的次数： " + times);
            
            byte[] buff = new byte[BUFF_LEN];
            int hasRead = 0;
            String result = null;
            for(int i = 0; i < times; i++){
                //之前SEEK指定了起始位置，这里读入指定字节组长度的内容，read方法返回的是下一个开始读的position
                hasRead = raf.read(buff);
                
                //如果读取的字节数小于0，则退出循环！ （到了字节数组的末尾）
                if(hasRead < 0){
                    break;
                }
                
                result = new String(buff, "gb2312");
                
                int count = this.getCountByKeyWords(result, keywords);
                
                if(count > 0){
                    this.curCount += count;
                }
            }
            
            KeyWordsCount kc = KeyWordsCount.getCountObject();
            kc.addCount(this.curCount);
            doneSignal.countDown();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
    
    public int getCountByKeyWords(String statement, String key){
        return statement.split(key).length-1;
    }

    public long getStart() {
        return start;
    }

    public void setStart(long start) {
        this.start = start;
    }

    public long getEnd() {
        return end;
    }

    public void setEnd(long end) {
        this.end = end;
    }

    public RandomAccessFile getRaf() {
        return raf;
    }

    public void setRaf(RandomAccessFile raf) {
        this.raf = raf;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public int getCurCount() {
        return curCount;
    }

    public void setCurCount(int curCount) {
        this.curCount = curCount;
    }

    public CountDownLatch getDoneSignal() {
        return doneSignal;
    }

    public void setDoneSignal(CountDownLatch doneSignal) {
        this.doneSignal = doneSignal;
    }
    
}
