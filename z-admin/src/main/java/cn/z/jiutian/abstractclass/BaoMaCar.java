package cn.z.jiutian.abstractclass;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaoMaCar extends Car {

    private static final Logger LOG = LoggerFactory.getLogger(BaoMaCar.class);
    
    @Override
    public void move() {
        LOG.info(" bao ma car is fast");
    }
}
