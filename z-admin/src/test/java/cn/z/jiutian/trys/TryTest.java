package cn.z.jiutian.trys;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import cn.z.jiutian.BaseTest;

public class TryTest extends BaseTest{

    private static final Logger LOG = LoggerFactory.getLogger(TryTest.class);
    
    @Test
    public void tryTest(){
        try {
            String[] arrs = new String[]{"123","24"};
            LOG.info(arrs[2]);
        } catch (Exception e) {
            LOG.info("滴答滴答");
            e.printStackTrace();
        }
    }

}
