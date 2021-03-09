package cn.z.jiutian.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class TestInterfaceImpl implements TestInterface {

	@Async
	@Override
	public void test() {
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("-------我现在被异步调用--------------");
		
	}
	
	@Override
	public void test1() {
		System.out.println("------我正在执行某项艰巨的任务---------------");
	}
	
}
