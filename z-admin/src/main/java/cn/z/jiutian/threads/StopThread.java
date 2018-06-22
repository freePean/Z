package cn.z.jiutian.threads;

import java.util.concurrent.TimeUnit;

public class StopThread {

    private static boolean stopRequested;
    
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            
            @Override
            public void run() {
                // TODO Auto-generated method stub
                int i = 0;
                while(stopRequested)
                    i++;
            }
        });
        t1.start();
        
        TimeUnit.SECONDS.sleep(1);
        stopRequested = true;
    }

}
