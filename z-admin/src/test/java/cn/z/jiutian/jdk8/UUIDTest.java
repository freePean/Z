package cn.z.jiutian.jdk8;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import cn.z.jiutian.BaseTest;


public class UUIDTest extends BaseTest{

    private static final Logger LOG = LoggerFactory.getLogger(UUIDTest.class);
    
    
    @Test
    public void uuidTest(){
        UUID uuid = UUID.randomUUID();
        LOG.info("------{}------", uuid.toString());
        LOG.info("uuid is {}", uuid);
    }

}
