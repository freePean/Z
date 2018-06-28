package cn.z.jiutian.system;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemDemo {

//    public static void main(String[] args) throws IOException {
//        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
////        if(input.read() != -1){
////            System.out.println(input.readLine());
////        }
//        System.out.println(input.readLine());
//    }
    
    public static void main(String[] args) throws IOException {
        int a = 0;
        a = System.in.read();
        System.in.getClass();
        
        System.out.println("a=" + a);
        int sum = 0;
        for(int i = 0; i <= a; i++){
            sum += i;
            System.out.println(sum);
        }
    }
}
