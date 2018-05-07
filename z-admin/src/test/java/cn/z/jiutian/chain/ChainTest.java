package cn.z.jiutian.chain;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import cn.z.jiutian.BaseTest;

public class ChainTest extends BaseTest{

    @Autowired
    private OrderService orderService;
    
    @Test
    public void chainTest(){
        orderService.execute();
    }

}
