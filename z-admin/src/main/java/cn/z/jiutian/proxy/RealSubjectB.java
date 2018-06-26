package cn.z.jiutian.proxy;


public class RealSubjectB implements SubjectB {


    @Override
    public void sayHello(String name) {
        // TODO Auto-generated method stub
        System.out.println("sayHello name is " + name);
    }

}
