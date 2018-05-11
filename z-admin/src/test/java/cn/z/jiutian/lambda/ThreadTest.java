package cn.z.jiutian.lambda;

import org.testng.annotations.Test;

public class ThreadTest {

    @Test
    public void threadTest(){
        new Thread(new Runnable() {
            
            @Override
            public void run() {
                System.out.println("Before Java8, too much code for too little to do");
            }
        }).start();;
    }

    @Test
    public void threadJava8Test(){
        new Thread(() -> System.out.println("In Java8, Lambda expression rocks !!") ).start();
    }
}
