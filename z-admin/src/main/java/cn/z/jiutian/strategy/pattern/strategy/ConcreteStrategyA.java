package cn.z.jiutian.strategy.pattern.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@cn.z.jiutian.strategy.pattern.annotation.Strategy(name="StrategyA")
public class ConcreteStrategyA  implements Strategy{

    private static final Logger LOG = LoggerFactory.getLogger(ConcreteStrategyA.class);
    
    @Override
    public void strategy(String input) {
        LOG.info("Strategy A for input : {}", input);
    }

}
