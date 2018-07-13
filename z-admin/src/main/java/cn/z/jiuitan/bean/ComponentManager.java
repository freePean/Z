package cn.z.jiuitan.bean;

import java.util.concurrent.ConcurrentHashMap;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


public class ComponentManager implements ApplicationContextAware, DisposableBean{

    private static ComponentManager instance = new ComponentManager();
    
    private ApplicationContext applicationContext;
    
    private final ConcurrentHashMap<String, Object> componentMap = new ConcurrentHashMap<String, Object>();
    
    @Override
    public void setApplicationContext(ApplicationContext arg0) throws BeansException {
        // TODO Auto-generated method stub
        this.applicationContext = arg0;
    }
    
    public Object getComponent(String name){
        Object component  = componentMap.get(name);
        if(component != null){
            return component;
        }
        
        component = getComponent(name);
        if(component != null){
            return component;
        }
        
        return null;
    }
    
    private Object getComponentVal(Object name){
        if(applicationContext == null){
            throw new IllegalStateException("-------错误--------------");
        }
        
        if(name instanceof Class){
            return applicationContext.getBean(((Class) name).getName());
        }else{
            return applicationContext.getBean(name.toString());
        }
    }
    
    @Override
    public void destroy() throws Exception {
        // TODO Auto-generated method stub
        
    }
    
}
