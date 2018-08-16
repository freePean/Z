package cn.z.jiutian.nio;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/*
 * http://www.importnew.com/19816.html
 */
public class NIOJava {

    //io模式
    public static void method2(){
        InputStream in = null;
        try {
            in = new BufferedInputStream(new FileInputStream("src/a.txt")); 
            
            byte[] buf = new byte[1024];
            int bytesRead = in.read(buf);
            while(bytesRead != -1){
                for(int i=0; i < bytesRead; i++){
                    System.out.println((char)buf[i]);
                }
                bytesRead = in.read(buf);
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            if(in != null){
                try {
                    in.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
    
    public static void method1(){
        RandomAccessFile aFile = null;
        try {
            aFile = new RandomAccessFile("src/a.txt","rw");
            FileChannel fileChannel = aFile.getChannel();
            ByteBuffer buf = ByteBuffer.allocate(1024);
            
            int bytesRead = fileChannel.read(buf);
            System.out.println(bytesRead);
            
            while(bytesRead != -1){
                buf.flip();
                while(buf.hasRemaining()){
                    System.out.println((char)buf.get());
                }
                
                buf.compact();
                bytesRead = fileChannel.read(buf);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    
    public static void main(String[] args) {
        method2();
    }
}
