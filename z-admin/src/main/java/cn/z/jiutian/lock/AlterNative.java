package cn.z.jiutian.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AlterNative {

	private Lock  lock = new ReentrantLock();
	
	Condition conditionA = lock.newCondition();
	Condition conditionB = lock.newCondition();
	Condition conditionC = lock.newCondition();
	
	private int count = 1;
	private int num = 1;
	
	public void outputA() {
		lock.lock();
		try {
			if(num != 1) {
				try {
					conditionA.await();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("A");
			conditionB.signal();
			num = 2;
		} finally {
			// TODO: handle finally clause
			lock.unlock();
		}
	}
	
	public void outputB() {
		lock.lock();
		try {
			if(num != 2) {
				try {
					conditionB.await();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("B");
			conditionC.signal();
			num = 3;
		} finally {
			// TODO: handle finally clause
			lock.unlock();
		}
	}
	
	public void outputC() {
		lock.lock();
		try {
			if(num != 3) {
				try {
					conditionC.await();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("C");
			System.out.println("循环到了:" + count + "次了");
			count++;
			conditionA.signal();
			num = 2;
		} finally {
			// TODO: handle finally clause
			lock.unlock();
		}
	}
	
}
