package cn.z.jiutian.future;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class FutureCook {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		long startTime = System.currentTimeMillis();
		
		Callable<Chuju> onlineShopping = new Callable<Chuju>(){
			@Override
			public Chuju call() throws Exception {
				System.out.println("第一步：下单");
				System.out.println("第一步：等待送货");
				Thread.sleep(10000);
				System.out.println("第一步：快递送到");
				return new Chuju();
			}
		};
		
		FutureTask<Chuju> task = new FutureTask<FutureCook.Chuju>(onlineShopping);
		new Thread(task).start();
		
		Thread.sleep(2000);
		Shicai shicai = new Shicai();
		System.out.println("第二步：食材到位");
		
		if(task.isDone()){
			System.out.println("第三步：厨具还没到，心情好就等待（心情不好就调用cancel方法取消订单）");
		}
		
		Chuju chuju = task.get();
		System.out.println("第三步： 厨具到位,开始展现厨艺");
		cook(chuju, shicai);
		
		System.out.println("总共用时： "+(System.currentTimeMillis() - startTime)+"ms");
	}
	
	static void cook(Chuju chuju, Shicai shicai){}
	
	static class Chuju{}
	
	static class Shicai{}
}
