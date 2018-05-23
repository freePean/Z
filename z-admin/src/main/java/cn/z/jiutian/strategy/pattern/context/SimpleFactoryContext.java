package cn.z.jiutian.strategy.pattern.context;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.XMLConfiguration;
import org.reflections.Reflections;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.z.jiutian.strategy.pattern.strategy.Strategy;

public class SimpleFactoryContext {

    private static final Logger LOG = LoggerFactory.getLogger(SimpleFactoryContext.class);
    private static Map<String, Class> allStrategies;

    static {
        Reflections reflections = new Reflections("cn.z.jiutian.strategy.pattern.strategy");
        Set<Class<?>> annotatedClasses = reflections
                .getTypesAnnotatedWith(cn.z.jiutian.strategy.pattern.annotation.Strategy.class);
        allStrategies = new ConcurrentHashMap<String, Class>();
        for (Class<?> classObject : annotatedClasses) {
            cn.z.jiutian.strategy.pattern.annotation.Strategy strategy = (cn.z.jiutian.strategy.pattern.annotation.Strategy) classObject
                    .getAnnotation(cn.z.jiutian.strategy.pattern.annotation.Strategy.class);
            allStrategies.put(strategy.name(), classObject);
        }
        allStrategies = Collections.unmodifiableMap(allStrategies);
    }

    private Strategy strategy;

    public SimpleFactoryContext() {
        String name = null;
        try {
            XMLConfiguration config = new XMLConfiguration("strategy.xml");
            name = config.getString("strategy.name");
            LOG.info("strategy name is {} ", name);
        } catch (ConfigurationException e) {
            // TODO: handle exception
            LOG.error("Parsing xml configuration file failed", e);
        }
        
        if(allStrategies.containsKey(name)){
            LOG.info("Created strategy name is {}", name);
            try {
                strategy = (Strategy) allStrategies.get(name).newInstance();
            } catch (InstantiationException | IllegalAccessException e) {
                // TODO: handle exception
                LOG.error("Instantiate Strategy failed", e);
            }
        }else{
            LOG.info("Specified Strategy name {} does not exit", name);
        }
    }
    
    

    public void action(String input) {
        strategy.strategy(input);
    }
}
