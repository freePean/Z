package cn.z.jiutian.Abserver;

import org.springframework.stereotype.Service;

@Service
public class userValidate extends ValidateObserver{

    @Override
    protected void execute() {
        System.out.println("userValidate================");
    }

}
