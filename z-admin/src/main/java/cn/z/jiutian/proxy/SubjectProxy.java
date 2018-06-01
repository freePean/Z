package cn.z.jiutian.proxy;


public class SubjectProxy implements Subject {

    Subject subimp = new RealSubject();
    
    public void doSomething(){
        subimp.doSomething();
    }
    

}
