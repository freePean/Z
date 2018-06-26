package cn.z.jiutian.proxy;


public class RealSubjectA implements SubjectA {

    @Override
    public void setUser(String name, String password) {
        // TODO Auto-generated method stub
        System.out.println("set user name=" + name + ", password=" + password );
    }

}
