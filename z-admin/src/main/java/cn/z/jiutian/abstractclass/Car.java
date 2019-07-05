package cn.z.jiutian.abstractclass;

public abstract class Car implements Move{

	static {
		System.out.println("static is abstract car ---");
	}
	
	public void run() {
		System.out.println("abstract car run() method ");
	}
	
	@Override
	public void move() {
		System.out.println("abstract car move() method");
	}
}
