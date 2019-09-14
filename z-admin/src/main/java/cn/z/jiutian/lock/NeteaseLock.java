package cn.z.jiutian.lock;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.LockSupport;

//有一个锁的面试题：一个状态：自己来实现一把Lock实现
//实现一个自己的锁。就需要对多线程的知识进行掌握
public class NeteaseLock implements Lock{

	//需要一个标志，来判断是否有人拿到锁
	AtomicReference<Thread> owner = new AtomicReference<>();
	//集合来存储我们的等待线程的信息
	LinkedBlockingQueue<Thread> waiters =  new LinkedBlockingQueue<>();
	
	
	//谈恋爱，一把定输赢
	@Override
	public boolean tryLock() {
		//cas 修改(内存操作)
		 return owner.compareAndSet(null, Thread.currentThread());
		
	}
	
	//如果拿不到锁，我会一直等待
	@Override
	public void lock() {
		boolean park = false;
		while(!tryLock()) {
			if(!park) {
				//加入等待集合
				waiters.offer(Thread.currentThread());
				park = true;
			}else {
				//问题：如何实现等待效果
				//TODO 假设此处进入等待
				LockSupport.park();
			}
			
		}
		waiters.remove(Thread.currentThread());
	}
	
	@Override
	public void lockInterruptibly() throws InterruptedException {
		
	}
	
	@Override
	public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
		return false;
	}
	
	@Override
	public Condition newCondition() {
		return null;
	}
	
	@Override
	public void unlock() {
		//TODO 释放锁之后，如何通知等待者 ：需要了解线程通信知识点
		if(owner.compareAndSet(Thread.currentThread(), null)) {
			//遍历等待者，通知继续执行
			Thread next = null;
			while((next = waiters.peek()) != null) {
				LockSupport.unpark(next);
			}
		}
	}
}
