package cn.z.jiutian.lang;

public class SwitchDemo {

	public static void getA() {
		System.out.println("-------A------");
	}
	
	public static void getB() {
		System.out.println("-------B-------");
	}
	
	public static void getC() {
		System.out.println("-------C--------");
	}
	
	public static void main(String[] args) {
		String str = "B";
		switch (str) {
		default:getC();
		case "A":getA();

		case "B":getB();
		
		}
	}
	
//	public static void main(String[] args) {
//		int x = 2;
//		int y = 3;
//		switch(x) {
//			default:
//				y++;
//			case 3:
//				y++;
//			case 4:
//				y++;
//		}
//		System.out.println("y = " + y);
//	}

}
