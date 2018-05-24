package cn.z.jiutian.observer;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import cn.z.jiutian.BaseTest;
import cn.z.jiutian.Abserver.RequestParam;
import cn.z.jiutian.Abserver.ValidateServiceImpl;

public class observertest extends BaseTest{

    @Autowired
    private ValidateServiceImpl validateServiceImpl;
    
    /*
     * 观察者模式测试类
     */
    @Test
    public void testValiate(){
    	RequestParam param = new RequestParam();
    	param.setType("pwd");
    	
        validateServiceImpl.execute(param);
    }

}
