package cn.z.jiutian.filter;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.commons.lang.StringUtils;

import com.google.common.collect.Multiset.Entry;

public class SelDefineInvalidCharacterFilter implements Filter{

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // TODO Auto-generated method stub
        
    }
    
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        // TODO Auto-generated method stub
        String parameterName = null;
        String parameterValue = null;
        
        @SuppressWarnings("unchecked")
        Enumeration<String> allParameter = request.getAttributeNames();
        Map<String, String> map = request.getParameterMap();
        
        for(String key : map.keySet()){
            for (String str : invalidCharacter) {
                if(StringUtils.containsIgnoreCase(key, str)){
                    request.setAttribute("errorMessage", "非法字符 : " + str);
                    RequestDispatcher requestDispatcher = request.getRequestDispatcher("/error.jsp");
                    requestDispatcher.forward(request, response);
                    return ;
                }
            }
        }
//        while(allParameter.hasMoreElements()){
//            parameterName = allParameter.nextElement();
//            parameterValue = request.getParameter(parameterName);
//            
//            if(null != parameterName){
//                for (String str : invalidCharacter) {
//                    if(StringUtils.containsIgnoreCase(str, parameterValue)){
//                        request.setAttribute("errorMessage", "非法字符： " + str);
//                        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/error.jsp");
//                        requestDispatcher.forward(request, response);
//                        return;
//                    }
//                }
//            }
//        }
        chain.doFilter(request, response);
    }
    
    private static String[] invalidCharacter = new String[]{
            "insert","select","update"
    };
    
    @Override
    public void destroy() {
        // TODO Auto-generated method stub
        
    }
    
}
