package pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-web2.xml");
		Landlord landlord = (Landlord) context.getBean("landlord", Landlord.class);
		landlord.service();
	}
	
}
