package cn.z.jiutian.method;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;

public class MethodUtils {

    private static final Logger LOG = LoggerFactory.getLogger("MethodUtils");
    
    public static List<CodeType> setMethod(List<Code> lists){
        Class<?> clazz = null;
        Method m = null;
        Field[] fs = null;
        Field f = null;
        String fieldName = null;
        String firstLetter = null;
        String getMethod = null;
        String setMethod = null;
        
        try {
            for(int i = 0; i< lists.size(); i++){
                Code c = lists.get(i);
                clazz = c.getClass();
                fs = clazz.getDeclaredFields();
                
                //CodeType c = new CodeType();
                for(int j = 0; i < fs.length; j++){
                    f = fs[j];
                    fieldName = f.getName();
                    firstLetter = fieldName.substring(0, 1).toUpperCase();
                    getMethod = "get" + firstLetter + fieldName.substring(1);
                    m = clazz.getMethod(getMethod, new Class[] {});
                    
                    Object obj = m.invoke(c);
                    LOG.info(JSON.toJSONString(obj));
                    
                    //setMethod = "set" + firstLetter + fieldName.substring(1);
                    //m = clazz.getMethod(setMethod, new Class[]{});
                    
                }
                
                
                
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        
        return null;
    }

}
