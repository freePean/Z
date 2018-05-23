package cn.z.jiutian.strategy.pattern.context;

import cn.z.jiutian.strategy.pattern.strategy.Strategy;

public class SimpleContext {

    private Strategy strategy;
    
    public SimpleContext(Strategy strategy) {
        this.strategy = strategy;
    }
    
    public void action(String input){
        strategy.strategy(input);
    }

}
