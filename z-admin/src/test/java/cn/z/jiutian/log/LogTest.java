package cn.z.jiutian.log;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import cn.z.jiutian.BaseTest;

public class LogTest extends BaseTest{

    private static final Logger LOG = LoggerFactory.getLogger(LogTest.class);
    
    @Test
    public void logTest() {
        User u = new User();
        u.setName("joy");
        u.setEmail("1234@163.com");
        u.setAddress("北京朝阳");
        
        LOG.info("u[{}]", u);
    }

    
    
    class User{
        private String name;
        private String address;
        private String email;
        
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getAddress() {
            return address;
        }
        public void setAddress(String address) {
            this.address = address;
        }
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        
    }
    
    public static void main(String[] args) {
        
        String i = null;
        
        System.out.println();
        
//        if(i == null || i == ""){
//            System.out.println("------------");
//        }
        System.out.println("a".hashCode());
//        if(i.equals(null) || i.equals("")){
//            System.out.println("---------------");
//        }
    }
}
