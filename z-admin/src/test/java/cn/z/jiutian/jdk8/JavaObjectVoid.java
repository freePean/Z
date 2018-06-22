package cn.z.jiutian.jdk8;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.alibaba.fastjson.JSON;

import cn.z.jiutian.BaseTest;

public class JavaObjectVoid extends BaseTest {

    private static final Logger  LOG = LoggerFactory.getLogger(JavaObjectVoid.class);
    
    @Test
    public void testVoid(){
        Employee emp = new Employee();
        emp.setId(1L);
        emp.setName("Loug Lea");
        emp.setDesc("java ");
        
        execute(emp);
        
        LOG.info(" emp is [{}]", JSON.toJSON(emp));
        
    }
    
    private void execute(Employee employee){
        employee.setDesc("java 名人");
    }

}
