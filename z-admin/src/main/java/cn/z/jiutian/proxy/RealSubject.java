package cn.z.jiutian.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RealSubject implements Subject {

    private static final Logger LOG = LoggerFactory.getLogger(RealSubject.class);
    
    @Override
    public void read() {
        // TODO Auto-generated method stub
        LOG.info("世界無限好！");
    }

    @Override
    public void write() {
        // TODO Auto-generated method stub
        LOG.info("上海的外灘，人多的一匹!");
    }
}
