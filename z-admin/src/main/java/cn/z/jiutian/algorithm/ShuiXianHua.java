package cn.z.jiutian.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 水仙花算法
 */
public class ShuiXianHua {

  //分解整数
    public static List<Integer> getNumber(int number){
        List<Integer> list = new ArrayList<Integer>();
        list.add(number%10);        //个位数
        list.add(number/10%10);     //十位数
        list.add(number/100);       //百位数
        return list;
    }

    public static void main(String[] args) {

        for(int i = 100;i<1000;i++){
            List<Integer> list = getNumber(i);
            int count = 0;

            for(int j = 0;j<list.size();j++){
                int cubed = (int)Math.pow(list.get(j), 3);//pow 返回第一个数的第二个参数次幂的值
                count = count + cubed;
            }

            if(count == i){
                System.out.println("水仙花数："+i);
            }

        }

    } 

}
