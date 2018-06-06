package cn.z.jiutian.rmi.client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import cn.z.jiutian.rmi.server.Hello;

public class HelloClient {

    public static void main(String[] args) {
        try {
            Hello h = (Hello) Naming.lookup("rmi://192.168.5.71:12312/Hello");
            System.out.println(h.sayHello("zx"));
        } catch (MalformedURLException e) {
            
        }catch (RemoteException e) {
            System.out.println("创建对象异常");
            e.printStackTrace();
        }catch (NotBoundException e) {
            System.out.println("对象未绑定");
        }
    }

}
