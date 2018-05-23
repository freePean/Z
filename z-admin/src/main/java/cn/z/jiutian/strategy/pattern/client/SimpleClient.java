package cn.z.jiutian.strategy.pattern.client;

import cn.z.jiutian.strategy.pattern.context.SimpleContext;
import cn.z.jiutian.strategy.pattern.strategy.ConcreteStrategyB;
import cn.z.jiutian.strategy.pattern.strategy.Strategy;

public class SimpleClient {

    public static void main(String[] args) {
        Strategy strategy = new ConcreteStrategyB();
        SimpleContext context = new SimpleContext(strategy);
        context.action("hello , world ");
    }

}
