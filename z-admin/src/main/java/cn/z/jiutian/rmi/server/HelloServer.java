package cn.z.jiutian.rmi.server;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class HelloServer {

    public static void main(String[] args) {
         try {
            Hello h = new HelloImpl();
            
            LocateRegistry.createRegistry(12312);
            
            Naming.bind("rmi://192.168.5.71:12312/Hello", h);
            System.out.println("HelloServer启动成功");
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

}
