package cn.z.jiutian.lock;

import java.util.concurrent.locks.LockSupport;

import org.testng.annotations.Test;

public class WaitNotify {

	/**包子店**/
	public static Object baozidian = null;
	
	@Test
	public void waitNotifyTest() throws Exception{
		new Thread(()-> { 
			
			if(baozidian == null) {//如果没有包子，进入等待
				try {
					Thread.sleep(5000L); //时间顺序安排不好，可能会被挂起，得不到
					synchronized (this) {
						System.out.println("1、进入等待");
						this.wait();
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("2、买到包子，回家");
		}).start();
		
		//3秒后，生产一个包子
		Thread.sleep(6000L);//假如三秒就会被挂起，买不到包子
		baozidian = new Object();
		synchronized (this) {
			this.notifyAll();
			System.out.println("3、通知消费者");
		}
		
		Thread.sleep(10000L);
	}
	
	@Test
	public void parkunparkTest() throws Exception{
		Thread thread1 = new Thread(()-> { 
			
			if(baozidian == null) {//如果没有包子，进入等待
				try {
					Thread.sleep(5000L); 
					synchronized (this) {
						System.out.println("1、进入等待");
						LockSupport.park();//将当前线程挂起，等待继续运行的许可
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("2、买到包子，回家");
		});
		
		thread1.start();
		
		//3秒后，生产一个包子
		Thread.sleep(3000L);//假如三秒就会被挂起，买不到包子
		baozidian = new Object();
		System.out.println("3、通知消费者");
		LockSupport.unpark(thread1);//给指定的线程，颁发继续运行的许可
		
		Thread.sleep(10000L);
	}
}
