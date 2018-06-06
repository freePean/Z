package cn.z.jiutian.rmi.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloImpl extends UnicastRemoteObject implements Hello{

    
    /**
     * <code>serialVersionUID</code> of comment
     */
    private static final long serialVersionUID = -5154263207488580178L;

    public HelloImpl() throws RemoteException{
        super();
    }
    
    @Override
    public String sayHello(String name) throws RemoteException {
        // TODO Auto-generated method stub
        return "Hello, " + name;
    }
    
}
