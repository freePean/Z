package cn.z.jiutian.activemq;

import javax.annotation.Resource;
import javax.jms.Destination;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class TextPush extends MessageSender{

//    @Resource(name="testPush")
//    private Destination destination;
    
    @Autowired
    private Destination testPush;

     
    @Override
    public void send(String message) {
        send(testPush, message);
    }
    
        public void sendMessage(String message) {
            // TODO Auto-generated method stub
            
        } 

}
