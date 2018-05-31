package cn.z.jiutian.proxy;

import java.lang.reflect.Method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class BookProxyLib implements MethodInterceptor{

    private static final Logger LOG = LoggerFactory.getLogger(BookProxyLib.class);
    
    private Object target;
    
    public Object getInstance(Object target){
        this.target = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        enhancer.setCallback(this);
        
        return enhancer.create();
    }
  
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        LOG.info("事务开始");
        proxy.invokeSuper(obj, args);
        LOG.info("事物结束");
        return null;
    } 

}
