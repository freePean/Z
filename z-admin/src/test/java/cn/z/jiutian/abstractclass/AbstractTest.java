package cn.z.jiutian.abstractclass;

import org.testng.annotations.Test;

import cn.z.jiutian.BaseTest;

public class AbstractTest extends BaseTest {

    @Test
    public void abstractTest(){
        Registry registry = new FullRegistry();
        registry.registry();
    }

}
