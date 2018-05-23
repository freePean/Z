package cn.z.jiutian.strategy.pattern.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@cn.z.jiutian.strategy.pattern.annotation.Strategy(name="StrategyB")
public class ConcreteStrategyB implements Strategy {

    private static final Logger LOG = LoggerFactory.getLogger(ConcreteStrategyB.class);
    
    public void strategy(String input) {
        // TODO Auto-generated method stub
        LOG.info("Strategy B for input : {} ", input);
    }

}
