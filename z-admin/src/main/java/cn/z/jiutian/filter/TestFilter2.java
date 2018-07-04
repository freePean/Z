package cn.z.jiutian.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.OncePerRequestFilter;

/**
 * @包名 :cn.z.jiutian.filter
 * @文件名 :TestFilter2.java 
 * TODO 类作用：
 * @系统名称 : 现金贷
 * @Author: wanglongxu 
 * @Date: 2018年7月4日 上午10:56:16
 * @版本号   :v0.0.01
 */
public class TestFilter2 extends OncePerRequestFilter{

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        //在DispatcherServlet之前执行
        System.out.println("############TestFilter2 doFilterInternal executed############");
        filterChain.doFilter(request, response);
        //在视图页面返回给客户端之前执行，但是执行顺序在Interceptor之后
        System.out.println("############TestFilter2 doFilter after############");
    }
    
}
