package cn.z.jiutian.mq;

import javax.jms.Destination;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import cn.z.jiutian.enums.Assert;


public abstract class MessageSender implements IMessageSender{

    private static final Logger logger = LoggerFactory.getLogger(MessageSender.class);
    
    @Autowired 
    private JmsTemplate jmsTemplate;
    
    public void send(Destination destination, String message){
        Assert.notNull("send()** message or destination is null",destination,message);
        //logger.info("send()** message or destination is null",destination,message);
        jmsTemplate.convertAndSend(destination, message);
    }
    
    public void send(Destination destination, Object message){
        Assert.notNull("send()** message or destination is null",destination, message);
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
        send(destination, gson.toJson(message));
    }
}
