package cn.z.jiutian.mq;


public interface IMessageSender {

    void send(String message);
    
    void send(Object message);
    
}
