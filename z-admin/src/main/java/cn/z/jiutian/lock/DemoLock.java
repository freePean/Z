package cn.z.jiutian.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DemoLock {

	int i = 0;

	public static void main(String[] args) throws InterruptedException {
		Thread[] threads = new Thread[7];
		DemoLock demo = new DemoLock();
		Lock lock = new NeteaseLock();
		
		for(int i = 0; i < threads.length; i++) {
			int finall = i;
			Thread thread  = new Thread(()-> {
				System.out.println("线程-" +finall+ "开始执行");
				
				for(int j = 0; j < 10000; j++) {
					lock.lock();
					try {
						demo.i++;
					} finally {
						// TODO: handle finally clause
						lock.unlock();
					}
					System.out.println("线程-" +finall+ "结束执行");
				}
			});
			threads[i] = thread;
			thread.start();
		}
		for(Thread thread : threads){
			thread.join();
		}
		System.out.println("执行次数:" + demo.i);
	}
	
	
}
