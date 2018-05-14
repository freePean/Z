package cn.z.jiutian.match;

import org.junit.Test;

public class MathTest {

    @Test
    public void mathTest1(){
        math(0.05);
    }
    
    public void math(double param){
        double a = param*100;
        double b = 100/a;
        System.out.println(b);
    }

}
