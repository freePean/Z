package cn.z.jiutian;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

@ContextConfiguration(locations = {"classpath:spring/spring-web.xml"})
public abstract class BeanTest extends AbstractTestNGSpringContextTests{

}
