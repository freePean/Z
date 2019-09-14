package cn.z.jiutian.threads;

/*
 * 代码有问题，会有异常报出
 * 
 * 启动3个线程打印递增的数字, 线程1先打印1,2,3,4,5, 然后是线程2打印6,7,8,9,10,
 *  然后是线程3打印11,12,13,14,15. 接着再由线程1打印16,17,18,19,20….以此类推, 直到打印到75. 程序的输出结果应该为:
 */
public class PrintRunnable implements Runnable{

	private static volatile int printNum = 0;
	private int threadId;
	private Object o;
	
	public PrintRunnable(int threadId, Object o) {
		this.threadId = threadId;
		this.o = o;
	}
	
	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		while(printNum < 75) {
			if(printNum/5%3 + 1 == threadId) {
				for(int i = 0 ; i < 5 ; i++) {
					System.out.println("线程" + threadId + ":" + (++printNum));
				}
				o.notifyAll();
			}else {
				try {
					o.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		Object o = new Object();
		new Thread( new PrintRunnable(1, o)).start();
		new Thread( new PrintRunnable(2, o)).start();
		new Thread( new PrintRunnable(3, o)).start();
	}
	
}
