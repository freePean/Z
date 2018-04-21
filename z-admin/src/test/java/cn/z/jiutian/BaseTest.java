package cn.z.jiutian;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;


@ContextConfiguration(locations = {"classpath:spring/spring-mybatis.xml"})
//@TransactionConfiguration(defaultRollback = false)
public abstract class BaseTest extends AbstractTestNGSpringContextTests{
    /**
     * 日志组件
     */
    protected static final Logger LOG = LoggerFactory.getLogger(BaseTest.class);
    
}
