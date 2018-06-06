package cn.z.jiutian.rmi.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

/*
 * https://blog.csdn.net/a19881029/article/details/9465663
 */

public interface Hello extends Remote{

    public String sayHello(String name) throws RemoteException;

}
