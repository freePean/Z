package cn.z.jiutian.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import cn.z.jiutian.BaseTest;

public class ProxyTest extends BaseTest{

    private static final Logger LOG = LoggerFactory.getLogger(ProxyTest.class);
    
    @Test
    public void dbQueryProxyTest(){
        IDBQuery q = new DBQueryProxy();
        String reqStr = q.request();
        LOG.info("reqStr is {}", reqStr);
    }

    @Test
    public void cglibTest(){
        BookProxyLib cglib = new BookProxyLib();
        BookProxyImpl bookCglib = (BookProxyImpl) cglib.getInstance(new BookProxyImpl());
        bookCglib.addBook();
    }
    
    @Test
    public void javaCgligProxyTest(){
        IDBQuery dbQuery = DBQueryHandler.createProxy();
        String str = dbQuery.request();
        LOG.info(str);
    }
}
