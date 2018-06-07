package cn.z.jiutian.future;

public class CommonCook {

	public static void main(String[] args) throws InterruptedException{
	
		long startTime = System.currentTimeMillis();
		
		OnlineShopping thread = new OnlineShopping();
		thread.start();
		thread.join();
		
		Thread.sleep(2000);
		Shicai shicai = new Shicai();
		System.out.println("第二步： 食材到位");
		
		System.out.println("第三步： 开始展现厨艺");
		cook(thread.chuju, shicai);
		
		System.out.println("总共用时  "+(System.currentTimeMillis()-startTime)+ "ms");
	}
	
	
	static class OnlineShopping extends Thread{
		private Chuju chuju;
		
		@Override
		public void run() {
			System.out.println("第一步： 下单");
			System.out.println("第一步： 等待送货");
			
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			System.out.println("第一步: 快递送到");
			chuju = new Chuju();
		}
	}
	
	static void cook(Chuju chuju, Shicai shicai){}
	
	static class Chuju{}
	
	static class Shicai{}
}
