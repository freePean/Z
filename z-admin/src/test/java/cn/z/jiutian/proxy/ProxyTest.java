package cn.z.jiutian.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import cn.z.jiutian.BaseTest;

public class ProxyTest extends BaseTest{

    private static final Logger LOG = LoggerFactory.getLogger(ProxyTest.class);
    
    @Test
    public void staticProxyTest(){
        Subject sub = new SubjectProxy();
        sub.read();
    }
    
    @Test
    public void cglibProxyTest(){
        ProxyHandler proxy = new ProxyHandler();
       //绑定该类实现的所有接口
        Subject sub = (Subject) proxy.bind(new RealSubject());
        sub.read();
    }
}
