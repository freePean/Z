package cn.z.jiutian.observer;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import cn.z.jiutian.BaseTest;
import cn.z.jiutian.Abserver.router;

public class observertest extends BaseTest{

    @Autowired
    private router router;
    
    /*
     * 观察者模式测试类
     */
    @Test
    public void testValiate(){
        router.execute();
    }

}
