package cn.z.jiuitan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

    @RequestMapping("/test.htm")
    public ModelAndView handleRequest(ModelMap model){
        System.out.println("---------TestController executed--------");
        return new ModelAndView("test");
    }
    
}
