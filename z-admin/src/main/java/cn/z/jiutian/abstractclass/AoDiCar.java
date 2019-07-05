package cn.z.jiutian.abstractclass;

public class AoDiCar extends Car {

	static {
		System.out.println("static is AoDiCar");
	}
	
	@Override
	public void move() {
		/*System.out.println("AoDiCar is move");*/
		super.move();
	}
	
	
	public static void main(String[] args) {
		AoDiCar param = new AoDiCar();
		param.move();
		param.run();
	}
	
}
