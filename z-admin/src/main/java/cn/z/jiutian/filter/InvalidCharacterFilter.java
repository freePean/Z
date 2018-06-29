package cn.z.jiutian.filter;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.springframework.web.filter.CharacterEncodingFilter;

/*
 * https://blog.csdn.net/reggergdsg/article/details/52821502
 */
public class InvalidCharacterFilter extends CharacterEncodingFilter{

    private static String[] invalidCharacter = new String[]{
            "select","script","insert"
    };
    
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        String parameterName = null;
        String parameterValue = null;
        
        @SuppressWarnings("unchecked")
        Enumeration<String> allParameter = request.getParameterNames();
        while(allParameter.hasMoreElements()){
            parameterName = allParameter.nextElement();
            parameterValue = request.getParameter(parameterName);
            
            if(null != parameterValue){
                for (String str : invalidCharacter) {
                    if(StringUtils.containsIgnoreCase(str, parameterValue)){
                        request.setAttribute("errorMessage", "非法字符： " + str);
                        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/error.jsp");
                        requestDispatcher.forward(request, response);
                        return;
                    }
                }
            }
        }
        
        super.doFilterInternal(request, response, filterChain);
    }
    
}
