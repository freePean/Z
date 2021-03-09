package pojo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Broker {

//	@Pointcut("execution(* pojo.Landlord.service())")
//	public void IService() {
//		
//	}
//	
//	@Before("IService()")
//	public void before() {
//		System.out.println("带租客看房");
//		System.out.println("谈价格");
//	}
//	
//	@After("IService()")
//	public void after() {
//		System.out.println("交钥匙");
//	}
	
	@Around("execution(* pojo.Landlord.service())")
	public void around(ProceedingJoinPoint joinPoint) {
		System.out.println("带租客看房");
		System.out.println("谈价格");
		
		try {
			joinPoint.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("交钥匙");
	}
	
}
