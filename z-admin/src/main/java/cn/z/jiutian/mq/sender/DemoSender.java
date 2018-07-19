package cn.z.jiutian.mq.sender;

import javax.jms.Destination;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.z.jiutian.mq.MessageSender;

@Service
public class DemoSender extends MessageSender{

    @Autowired
    private Destination demoPush;
    
    @Override
    public void send(Object message) {
        send(demoPush, message);
    }
    
    @Override
    public void send(String message) {
        send(demoPush, message);
    }
    
}
