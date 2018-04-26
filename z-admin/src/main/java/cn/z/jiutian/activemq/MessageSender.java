package cn.z.jiutian.activemq;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ScheduledMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.util.Assert;


public abstract class MessageSender implements IMessageSender{

    @Autowired
    private JmsTemplate jmsTemplate;

    public void send(Destination destination, String message){
        Assert.notNull(destination, "send() ** destination is not null");
        Assert.notNull(message, "send() ** message is not null");
        jmsTemplate.send(destination, new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                TextMessage textMessage = session.createTextMessage();
                long time = 1*60*1000;
                textMessage.setLongProperty(ScheduledMessage.AMQ_SCHEDULED_DELAY, time);
                return textMessage;
            }
        });
    }
    
    public void sendMessage(Destination destination, String message){
        jmsTemplate.convertAndSend(destination, message);
    }
    
//    public void send(Destination destination, Object message){
//        Assert.notNull(destination, "send() ** destination is not null");
//        Assert.notNull(message, "send() ** message is not null");
//        jmsTemplate.send(destination, new MessageCreator() {
//            
//            @Override
//            public Message createMessage(Session session) throws JMSException {
//                TextMessage textMessage = session.createTextMessage();
//                return null;
//            }
//        });
//    }
}
