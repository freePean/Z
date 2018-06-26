package cn.z.jiutian.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

public class LogHandler implements InvocationHandler{

    private Object proxied;
    
    public LogHandler(Object proxied) {
        // TODO Auto-generated constructor stub
        this.proxied = proxied;
    }
    
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // TODO Auto-generated method stub
        System.out.println("begin to invoke method : " + method.getName() + " params:" + Arrays.toString(args));
        
        Object result = method.invoke(proxied, args);
        
        System.out.println("invoke " + method.getName() + " end");
        return result;
    }

}
