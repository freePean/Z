package cn.z.jiutian.vm;

public class VMDemo {

	/*
	 *  -XX:+PrintGCDetails
	 */
	public static void main(String[] args) {
		new VMDemo().doTest();
	}
	
	public void doTest() {
		Integer M = new Integer(1024*1024*1);
		byte[] bytes = new byte[1*M];
		bytes = null;
		System.gc();
		System.out.println();
		bytes = new byte[1*M];
		bytes = new byte[1*M];
		System.gc();
		System.out.println();
	}
}
