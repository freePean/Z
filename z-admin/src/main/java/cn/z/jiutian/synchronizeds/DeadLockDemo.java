package cn.z.jiutian.synchronizeds;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class DeadLockDemo {

    private static String A = "A";
    private static String B = "B";
    
    private void deadLock(){
        Thread t1 = new Thread(new Runnable() {
            
            @Override
            public void run() {
                    // TODO Auto-generated method stub
                    synchronized(A){
                    try {
                        //Thread.currentThread().sleep(1000);
                        Thread.sleep(3000);
                    } catch (Exception e) {
                        // TODO: handle exception
                        e.printStackTrace();
                    }
                    
                    synchronized (B) {
                        System.out.println("1");
                    }
                }
            }
        });
        
        Thread t2 = new Thread(new Runnable() {
            
            @Override
            public void run() {
                // TODO Auto-generated method stub
                synchronized (B) {
                    synchronized (A) {
                        System.out.println("2");
                    }
                }
            }
        });
        
        t1.start();
        t2.start();
    }

    public static void main(String[] args) {
        new DeadLockDemo().deadLock();
    }
}
