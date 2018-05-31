package cn.z.jiutian.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//动态代理
public class DBQueryHandler implements InvocationHandler {

    IDBQuery real = null;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if (real == null) {
            real = new DBQuery();
        }

        return real.request();
    }

    public static IDBQuery createProxy() {
        IDBQuery proxy = (IDBQuery) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[] { IDBQuery.class },
                 new DBQueryHandler());
        
        return proxy;
    }
}
