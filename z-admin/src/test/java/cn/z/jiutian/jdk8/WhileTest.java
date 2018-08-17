package cn.z.jiutian.jdk8;

import org.testng.annotations.Test;

import cn.z.jiutian.BaseTest;

public class WhileTest extends BaseTest {

    @Test
    public void test1(){
        int i = 1;
        while(true){
            System.out.println(i++);
            if( i == 20 ){
                break;
            }
        }
    }
    
}
