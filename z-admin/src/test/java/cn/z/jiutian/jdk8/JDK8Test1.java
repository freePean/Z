package cn.z.jiutian.jdk8;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.sun.istack.internal.NotNull;

import cn.z.jiutian.BaseTest;

public class JDK8Test1 extends BaseTest {
 
    private static final Logger log = LoggerFactory.getLogger(JDK8Test1.class);
   
    //private  List<@NotNull String> lists = new ArrayList<String>();
    
    @Test
    public void testStringJoin(){
        String str = String.join("/", "usr","local","local");
        log.info("str:{},str:{}",str,str); 
    }

    public static void main(String[] args) {
        //int  a = 100000*100000;
        //System.out.println(a);
        
        //int b = Math.multiplyExact(100000, 100000);
        //System.out.println(b);
//        lists = null;
//        System.out.println(lists);
    }
    
//    @Test
//    public void testNonNull(){
//        lists = null;
//        System.out.println(lists);
//    }
    
}
