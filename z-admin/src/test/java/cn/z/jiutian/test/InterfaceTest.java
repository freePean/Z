package cn.z.jiutian.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import cn.z.jiutian.BaseTest;

public class InterfaceTest extends BaseTest{

    @Autowired
    private Support support;
    
    @Test
    public void test1(){
        support.getInfo();
    }
    
}
