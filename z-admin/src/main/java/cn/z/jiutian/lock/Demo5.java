package cn.z.jiutian.lock;

public class Demo5 {

	public static void main(String[] args) {
		AlterNative a = new AlterNative();
		
		new Thread(()->{ 
			
			for(int i = 0; i< 20; i++) {
				a.outputA();
			}
		}).start();
		
        new Thread(()->{ 
			
			for(int i = 0; i< 20; i++) {
				a.outputB();
			}
		}).start();
        
        new Thread(()->{ 
			
			for(int i = 0; i< 20; i++) {
				a.outputC();
			}
		}).start();
	}
	
}
