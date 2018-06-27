package cn.z.jiutian.io;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class IoChannel {

    public static void main(String[] args) throws IOException {
        PipedOutputStream output = new PipedOutputStream();
        PipedInputStream input = new PipedInputStream(output);
        
        
        Thread t1 = new Thread(new Runnable() {
            
            @Override
            public void run() {
                // TODO Auto-generated method stub
                try {
                    int data = input.read();
                    while(data != -1){
                        System.out.print((char) data);
                        data = input.read();
                    }
                    
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }
        });
        
        Thread t2 = new Thread(new Runnable() {
            
            @Override
            public void run() {
                // TODO Auto-generated method stub
                try {
                    output.write("hello world, piped".getBytes());
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }
        });
        
        t2.start();
        t1.start();
        
//        try {
//            out.flush();
//            out.close();
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
        
        
    }
    
}
