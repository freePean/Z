package cn.z.jiutian.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class BaseInterceptor implements HandlerInterceptor{

    /**
     * 在DispatcherServlet之前执行
     * */
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        System.out.println("************BaseInterceptor preHandle executed**********");
        return true;
    }
    
    /**
     * 在controller执行之后的DispatcherServlet之后执行
     * */
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
            ModelAndView modelAndView) throws Exception {
        System.out.println("************BaseInterceptor postHandle executed**********");
        
    }
    
    /**
     * 在页面渲染完成返回给客户端之前执行
     * */
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        // TODO Auto-generated method stub
        System.out.println("************BaseInterceptor afterCompletion executed**********");
    }
    
}
