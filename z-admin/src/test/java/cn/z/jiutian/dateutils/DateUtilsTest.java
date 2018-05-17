package cn.z.jiutian.dateutils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class DateUtilsTest {

    public int calcDateCount(String args1, String args2){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date args3 = sdf.parse(args1);
            Date args4 = sdf.parse(args2);
            //System.out.println(args4.getTime()-args3.getTime());
            return (int)Math.abs((args4.getTime()-args3.getTime())/(60*60*24*1000));
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return 0;
    }
    
    @Test
    public void test1(){
        System.out.println(calcDateCount("2018-5-12","2018-6-14"));
        //System.out.println(Math.abs(-9.9));
    }

}
