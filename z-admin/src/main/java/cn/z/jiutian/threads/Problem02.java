package cn.z.jiutian.threads;

import java.util.ArrayList;
import java.util.List;

/*
 * 启动3个线程打印递增的数字, 线程1先打印1,2,3,4,5 
 * 然后是线程2打印6,7,8,9,10 然后是线程3打印11,12,13,14,15.
 * 接着再由线程1打印16,17,18,19,20…依次类推, 直到打印到60。
 */
public class Problem02 {

//	public static void main(String[] args) {
//		final Hander hander  = new Hander();
//		for(int i = 0; i < 3; i++) {
//			new Thread(new Runnable() {
//
//				@Override
//				public void run() {
//					// TODO Auto-generated method stub
//					
//				}
//				
//			});
//		}
//	}
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(3);
		list.add("q");
		list.add("w");
		list.add("e");
		list.set(0, "a");
		
		System.out.println(list.toString());
	}
	
}

class Hander{
	private int no = 1;
	
	private int status = 0;
	;
	public synchronized void print(String threadName) {
		int threadIndex = Integer.parseInt(threadName);
		while(threadIndex != status) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Thread-" + threadName + ":");
		
		for(int count = 0; count < 5; count++, no++) {
			if(count > 0) {
				System.out.print(",");
			}
			System.out.print(no);
		}
		System.out.println();
		status = (status + 1)%3;
		this.notifyAll();
	}
}