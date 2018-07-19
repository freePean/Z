package cn.z.jiutian.activemq;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import com.alibaba.fastjson.JSON;

import cn.z.jiutian.BaseTest;
import cn.z.jiutian.mq.DemoDto;
import cn.z.jiutian.mq.IMessageSender;

public class MqTest extends BaseTest{

    @Autowired
    private IMessageSender demoSender;
    
    @Test
    public void sendTest1(){
        DemoDto dto = new DemoDto();
        dto.setMsg("你个大棒槌");
        demoSender.send(JSON.toJSON(dto));
    }
}
