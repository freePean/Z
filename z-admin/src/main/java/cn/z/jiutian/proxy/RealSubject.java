package cn.z.jiutian.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RealSubject implements Subject {

    private static final Logger LOG = LoggerFactory.getLogger(RealSubject.class);
    
    @Override
    public void doSomething() {
        LOG.info("call doSomething");
    }

}
