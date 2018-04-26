package cn.z.jiutian.activemq;

public interface IMessageSender {

    void send(String message);
    
    void sendMessage(String message);
}
