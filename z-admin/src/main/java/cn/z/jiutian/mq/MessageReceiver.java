package cn.z.jiutian.mq;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.TextMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import cn.z.jiutian.enums.Assert;
import cn.z.jiutian.exception.BaseException;

public abstract class MessageReceiver<T> implements IMessageReceiver {

    protected static final Logger logger = LoggerFactory.getLogger(MessageReceiver.class);
    
    protected T parseObject(Message message,Class<T> type){
        if(message instanceof TextMessage) {
            TextMessage textMessage = (TextMessage) message;
            try {
                String objStr = textMessage.getText();
                Assert.notNull("parseObject()** message is null",objStr);
                Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
                return gson.fromJson(objStr, type);
            } catch (JMSException e) {
                throw new BaseException("parseObject()** message content is error");
            }
        }
        throw new BaseException("parseObject()** message type is error");
    }
    
}
