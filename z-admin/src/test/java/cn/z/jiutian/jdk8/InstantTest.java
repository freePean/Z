package cn.z.jiutian.jdk8;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;

import org.testng.annotations.Test;


public class InstantTest {

    public static void main(String[] args) {
        Instant ins = Instant.now();
        System.out.println(Date.from(ins));
        
        Instant inss = Instant.ofEpochMilli(new Date().getTime());
        System.out.println(Date.from(inss));
        
        System.out.println(Instant.parse("1995-10-23T10:12:35Z"));
    }
    
    @Test
    public void localDateTest(){
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
    }

    @Test
    public void tryWithResourceTest() {
        
    }
    
    
//    private static void arrayIndex() throws IOException{
//        try(
//              User u = new User();
//                ){
//            
//        } catch (Exception e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//    }
    
//    class User implements AutoCloseable{
//        private String name;
//        private String address;
//        
//        public String getName() {
//            return name;
//        }
//        public void setName(String name) {
//            this.name = name;
//        }
//        public String getAddress() {
//            return address;
//        }
//        public void setAddress(String address) {
//            this.address = address;
//        }
//        /**
//         * TODO 方法作用：
//         * @throws Exception
//         * @Author: wanglongxu
//         * @Date: 2018年5月18日 下午5:04:43
//         */ 
//        @Override
//        public void close() throws Exception {
//            // TODO Auto-generated method stub
//            
//        }
//    }
}
