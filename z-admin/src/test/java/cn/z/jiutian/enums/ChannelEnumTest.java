package cn.z.jiutian.enums;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class ChannelEnumTest {

    private static final Logger LOG = LoggerFactory.getLogger("ChannelEnumTest");

    @Test
    public void channelTest(){
        String info = Channels.getInfo(4, false);
        LOG.info(info);
    }
    
    @Test
    public void expressionTest(){
        LOG.info(false?"hello world":true?"1":"2");
    }
}
