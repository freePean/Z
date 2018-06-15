package cn.z.jiuitan.extend;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import cn.z.jiutian.BaseTest;

public class CTest extends BaseTest{

    private static final Logger LOG = LoggerFactory.getLogger(CTest.class);
    
    @Test
    public void cTest(){
        C c = new C1();
        System.out.println(c.func(2, 1));
        LOG.info("+++++++++++",c.func(2, 1));
    }

}
