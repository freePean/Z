package cn.z.jiutian.arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import cn.z.jiutian.BaseTest;

public class Array2Demo extends BaseTest{

    private static final Logger LOG = LoggerFactory.getLogger(Array2Demo.class);
    
    public static void main(String[] args) {
        int[ ] [ ] arr={{1,2,3},{4,5,6}};
        
        System.out.println(arr[1][1]);
        
        int[] arrs = arr[0];
        for (int i : arrs) {
            System.out.println(i);
        }
    }
    
    @Test
    public void splitTest(){
        String str = "1, 12, 123, 1234, 12345";
        
        String[] ss = str.split(",");
        
        for (String string : ss) {
            System.out.print(string + " ");
        }
    }

}
