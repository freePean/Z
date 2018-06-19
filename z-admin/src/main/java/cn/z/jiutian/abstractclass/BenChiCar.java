package cn.z.jiutian.abstractclass;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BenChiCar extends Car {

    private static final Logger LOG = LoggerFactory.getLogger(BenChiCar.class);
    
    @Override
    public void move() {
        // TODO Auto-generated method stub
        LOG.info("ben chi car is faster");
    }
}
