package cn.z.jiutian.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BookProxyImpl implements BookProxy{

    private static final Logger LOG = LoggerFactory.getLogger(BookProxyImpl.class);
    
    @Override
    public void addBook() {
        LOG.info("增加图书的普通方法...");
    }

}
