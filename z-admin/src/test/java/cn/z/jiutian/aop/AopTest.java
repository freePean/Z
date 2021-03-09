package cn.z.jiutian.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

import cn.z.jiutian.BaseTest;
import pojo.Landlord;

public class AopTest {

	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-web2.xml");
		Landlord landlord = (Landlord) context.getBean("landlord", Landlord.class);
		landlord.service();
		//System.out.println("========================");
	}
	
}
