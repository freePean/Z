package cn.z.jiutian.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

import org.testng.annotations.Test;

public class ThreadTest {

    @Test
    public void threadTest(){
        ExecutorService service = Executors.newFixedThreadPool(100);
        
    }

}
