package cn.z.jiutian.system;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SystemDemo {

//    public static void main(String[] args) throws IOException {
//        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
////        if(input.read() != -1){
////            System.out.println(input.readLine());
////        }
//        System.out.println(input.readLine());
//    }
    
//    public static void main(String[] args) throws IOException {
//        int a = 0;
//        a = System.in.read();
//        System.in.getClass();
//        
//        System.out.println("a=" + a);
//        int sum = 0;
//        for(int i = 0; i <= a; i++){
//            sum += i;
//            System.out.println(sum);
//        }
//    }
    
//    public static void main(String[] args) throws IOException {
//        InputStream input = System.in;
//        int data = input.read();
//        while(data != -1){
//            data = input.read();
//            System.out.println(data);
//        }
//    }
    
//    public static void main(String[] args) throws IOException {
//        InputStream input = new FileInputStream(new File("d:\\8000\\1.txt"));
//        input.mark(3);
//        BufferedReader bs = null;
//        if(!input.markSupported()){
//            bs = new BufferedReader(new InputStreamReader(input));
//        }
//        
//        System.out.println(bs.readLine());
//    }
    
//    public void read(InputStream in) throws IOException{
//        if(in == null){
//            return ;
//        }
//        
//        int len = 0;
//        in.mark(1);
//        in.read();
//        in.reset();
//        in.read();
//    }
//    
//    public static void main(String[] args) {
//        
//    }
	
	public static void main(String[] args) {
		BigDecimal b = new BigDecimal(10);
		b = b.add(new BigDecimal(20));
		String str = "abc";
		System.out.println(b.toString());
		
		
		List<String> lists = new ArrayList<String>();
	}
}
