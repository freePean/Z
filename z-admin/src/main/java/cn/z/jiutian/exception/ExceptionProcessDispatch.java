//package cn.z.jiutian.exception;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//
//import org.apache.commons.collections.CollectionUtils;
//import org.springframework.beans.BeansException;
//import org.springframework.beans.factory.BeanFactoryUtils;
//import org.springframework.beans.factory.InitializingBean;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.ApplicationContextAware;
//import org.springframework.core.OrderComparator;
//
//import com.dx.framework.exception.handler.ExceptionHandler;
//import com.dx.framework.exception.model.RawExceptionInfo;
//import com.dx.framework.exception.utils.ApplicationContextHolder;
//
//public class ExceptionProcessDispatch implements InitializingBean,ApplicationContextAware {
//    private List<ExceptionHandler> handlers;    
//    private ApplicationContext applicationContext;
//    
//    public void process(RawExceptionInfo exceptionInfo){
//        if(CollectionUtils.isEmpty(handlers)){          
//            return;
//        }
//        
//        for(ExceptionHandler handler:handlers){
//            handler.handle(exceptionInfo);
//        }       
//    }
//    /*
//     * initial handlers, include all ExceptionHandler bean defined in spring context
//     * 
//     */
//    public void afterPropertiesSet() throws Exception{      
//        Map<String, ExceptionHandler> matchingBeans =
//                BeanFactoryUtils.beansOfTypeIncludingAncestors(applicationContext, ExceptionHandler.class, true, false);
//        
//        if (!matchingBeans.isEmpty()) {
//            this.handlers = new ArrayList<ExceptionHandler>(matchingBeans.values());
//            // We keep handlers in sorted order.
//            OrderComparator.sort(this.handlers);
//        }       
//    }   
//    
//    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException{
//        this.applicationContext = applicationContext;
//        ApplicationContextHolder.setApplicationContext(applicationContext);
//    }
//}