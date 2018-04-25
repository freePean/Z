package cn.z.jiutian.Abserver;

import java.util.Observable;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

public class ValidateObserver extends ObserverAStr{

    @Autowired
    private router router;
    
    @PostConstruct
    public void init(){
        this.router.addObserver(this);
    }
    
    @Override
    public void update(Observable o, Object arg) {
        execute();
    }

    protected void execute(){
        System.out.println("validateobserver===================");
        
    }
    
}
