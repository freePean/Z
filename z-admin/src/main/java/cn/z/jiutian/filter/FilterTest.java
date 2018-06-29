package cn.z.jiutian.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FilterTest implements Filter{

    @Override
    public void destroy() {
        // TODO Auto-generated method stub
        System.out.println("-------Filter 销毁---------------");
    }
    
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        // TODO Auto-generated method stub
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        
        response.setContentType("text/html;charset=UTF-8");
        System.out.println("-----调用service之前执行一段代码--------");
        chain.doFilter(request, response);
        System.out.println("-----调用service之后执行一段代码--------");
    }
    
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // TODO Auto-generated method stub
        System.out.println("----------Filter 初始化--------------");
    }
    
}
