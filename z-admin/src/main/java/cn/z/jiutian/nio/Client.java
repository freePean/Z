package cn.z.jiutian.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.concurrent.TimeUnit;

public class Client {

    public static void client(){
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        SocketChannel socketChannel = null;
        
        try {
            socketChannel = SocketChannel.open();
            socketChannel.configureBlocking(false);//非阻塞
            socketChannel.connect(new InetSocketAddress("192.168.5.102", 8080));
            
            if(socketChannel.finishConnect()){
                int i = 0;
                while(true){
                   TimeUnit.SECONDS.sleep(1);
                   String into = "I'm " + i+++ "-th information form client ";
                   buffer.clear();
                   buffer.put(into.getBytes());
                   buffer.flip();
                   while(buffer.hasRemaining()){
                       System.out.println(buffer);
                       socketChannel.write(buffer);
                   }
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }finally{
            try {
                socketChannel.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    
    public static void main(String[] args) {
        client();
    }
}
