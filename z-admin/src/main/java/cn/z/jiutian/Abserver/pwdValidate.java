package cn.z.jiutian.Abserver;

import org.springframework.stereotype.Service;


@Service
public class pwdValidate extends ValidateObserver{

   
    @Override
    protected void execute() {
        System.out.println("pwdValiadte================");
    }

}
