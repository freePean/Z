package cn.z.jiutian.map;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.z.jiutian.BaseTest;

public class MapTest extends BaseTest {

    private static final Logger logger = LoggerFactory.getLogger(MapTest.class);

    /*
     * 然而并没有发现下面例子会死锁
     */
    public static void main(String[] args) throws InterruptedException {
        final HashMap<String, String> map = new HashMap<String, String>(2);
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000000; i++) {
                    String str = UUID.randomUUID().toString();
                    Thread t1 = new Thread(new Runnable() {
                        @Override
                        public void run() {
                            map.put(str, "");
                        }
                    }, "ftff" + i);
                    t1.start();
                    System.out.println("key : " + str + " , t1's name " + t1.getName());
                    // System.out.println(t1.getName());
                }
            }
        }, "ftf");
        t.start();
        t.join();
        System.out.println(t.getName());
    }

    @Test
    public void mapTest() {

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("语文", 1);
        map.put("数学", 2);
        map.put("英语", 3);
        map.put("历史", 4);
        map.put("政治", 5);
        map.put("地理", 6);
        map.put("生物", 7);
        map.put("化学", 8);
        for (Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    
    @Test
    public void test(){
        int a = 1 << 30;
        System.out.println(a);
    }

}
