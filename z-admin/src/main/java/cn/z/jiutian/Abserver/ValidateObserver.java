package cn.z.jiutian.Abserver;

import java.util.Observable;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class ValidateObserver extends ObserverAStr<RequestParam> {

    @Autowired
    private ValidateRouter validateRouter;
    
    @PostConstruct
    public void init(){
        validateRouter.addObserver(this);
    }
    
    @Override
    public void update(Observable o, Object arg) {
    	RequestParam param = (RequestParam) arg;
    	if(!supports(param)){
    	    return ;
    	}
        execute(param);
    }

    protected void execute(RequestParam param){
        System.out.println("validateobserver===================");
        
    }
    
}
