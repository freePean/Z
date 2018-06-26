package cn.z.jiutian.proxy;

import java.lang.reflect.Proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import cn.z.jiutian.BaseTest;

public class ProxyTest extends BaseTest{

    private static final Logger LOG = LoggerFactory.getLogger(ProxyTest.class);
    
//    @Test
//    public void staticProxyTest(){
//        Subject sub = new SubjectProxy();
//        sub.read();
//    }
    
    @Test
    public void cglibProxyTest(){
        ProxyHandler proxy = new ProxyHandler();
       //绑定该类实现的所有接口
        Subject sub = (Subject) proxy.bind(new RalmSubject());
        sub.read();
    }
    
    @Test
    public void dynamicProxy(){
        RealSubjectA realA = new RealSubjectA();
        SubjectA proxySubjectA = (SubjectA) Proxy.newProxyInstance(SubjectA.class.getClassLoader(), new Class[]{SubjectA.class}, new LogHandler(realA));
        
        RealSubjectB realB = new RealSubjectB();
        SubjectB proxySubjectB = (SubjectB) Proxy.newProxyInstance(SubjectB.class.getClassLoader(), new Class[]{SubjectB.class}, new LogHandler(realB));
        
        proxySubjectA.setUser(" heaven ", " 123456");
        proxySubjectB.sayHello(" my god ");
    }
}
