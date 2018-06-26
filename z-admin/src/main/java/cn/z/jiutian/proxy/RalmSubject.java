package cn.z.jiutian.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RalmSubject implements Subject {
 
    private static final Logger LOG = LoggerFactory.getLogger(RalmSubject.class);
    
    @Override
    public void read() {
        // TODO Auto-generated method stub
        LOG.info("this is ralmSubject read()");
    }

    @Override
    public void write() {
        // TODO Auto-generated method stub
        LOG.info("this is ralmSubject write()");
    }

}
