package cn.z.jiutian.method;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import com.alibaba.fastjson.JSON;

import cn.z.jiutian.BaseTest;

public class MethodTest extends BaseTest {

    @Test
    public void methodReflectTest() throws Exception{
//        List<Code> lists = new ArrayList<Code>();
//        
//        Code c1 = new Code();
//        c1.setCodeType("bizId");
//        c1.setValue("2");
//        
//        Code c2 = new Code();
//        c2.setCodeType("castId");
//        c2.setValue("2654");
//        
//        Code c3 = new Code();
//        c3.setCodeType("orderId");
//        c3.setValue("12312");
//        
//        lists.add(c1);
//        lists.add(c2);
//        lists.add(c3);
//        
//        MethodUtils.setMethod(lists);
        
        CodeType code = MethodTest.setValue("bizId", "12232");
        LOG.info(JSON.toJSONString(code));
    }
    
    public static CodeType setValue(String codeType, String value) throws Exception{
        CodeType cType = new CodeType();
        Class<?> clazz = null;
        //Field[] fields = null;
        //Field field = null;
        Method method = null;
        String firstLetter = null;
        String setMethod = null;
        
        clazz = cType.getClass();
        //fields = clazz.getDeclaredFields();
        firstLetter = codeType.substring(0, 1).toUpperCase();
        setMethod = "set" + firstLetter + codeType.substring(1);
        method = clazz.getMethod(setMethod, new Class[]{value.getClass()});
        method.invoke(cType, value);
        
        return cType;
        
    }

}
