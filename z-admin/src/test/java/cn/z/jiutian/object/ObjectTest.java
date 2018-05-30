package cn.z.jiutian.object;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import cn.z.jiutian.BaseTest;

public class ObjectTest extends BaseTest {

    private static final Logger LOG = LoggerFactory.getLogger(ObjectTest.class);
    
    public static void main(String[] args) throws Exception{
//        Object obj = Array.newInstance(String.class, 10);
//        Array.set(obj, 0, "hello");
//        Array.set(obj, 1, "world");
//        //System.out.println(Array.get(obj, 1));
//        String[] items = (String[])obj;
//        for(String item : items){
//            System.out.println(item);
//        }
        Person p = null;
        Class<?> clazz = Class.forName("cn.z.jiutian.object.Person");
        p = (Person) clazz.newInstance();
        System.out.println(p.getName());
      
    }
    
    @Test
    public void instanceTest() throws InstantiationException, IllegalAccessException{
        Person p = Person.class.newInstance();
        
        LOG.info("name is {}", p.getName());
    }

}
