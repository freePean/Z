package cn.z.jiutian.test;

import org.springframework.stereotype.Service;

@Service
public class SonClass extends AbstractSupport{

    static{
        System.out.println("son class");
    }
    
    @Override
    public void getInfo() {
        System.out.println("who are you");
    }
    
}
