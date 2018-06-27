package cn.z.jiutian.jdk8;

import java.math.BigDecimal;
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
    
    @Test
    public void longTest(){
        long MAX_VALUE = 0x7fffffffffffffffL;
        System.out.println(MAX_VALUE);
        BigDecimal ba = new BigDecimal(String.valueOf(MAX_VALUE));
        System.out.println(ba.longValue());
    }
    
    @Test
    public void whileTest(){
        int start = 1;
        boolean flag = false;
        
        while( start <= 100){
            if(flag){
                start++;
            }
        }
    }
}
