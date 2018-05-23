package cn.z.jiutian.strategy.pattern.client;

import cn.z.jiutian.strategy.pattern.context.SimpleFactoryContext;

public class SimpleFactoryClient {

    public static void main(String[] args) {
        SimpleFactoryContext context = new SimpleFactoryContext();
        context.action("hello , world");
    }

}
