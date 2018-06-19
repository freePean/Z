package cn.z.jiutian.enums;

import java.util.Arrays;
// https://blog.csdn.net/javazejian/article/details/71333103
public class EnumDemo {

    public static void main(String[] args) {
        // Day day = Day.MONDAY;
        // System.out.println(day);

//        Day[] days = new Day[] { Day.MONDAY, Day.TUESDAY, Day.WEDNESDAY, Day.THURSDAY, Day.FRIDAY, Day.SATURDAY,
//                Day.SUNDAY };
        Day[] days = Day.values();
        
        for(int i = 0; i < days.length; i++){
            System.out.println("day[" + i + "].ordinal(): " + days[i].ordinal());
        }
        
        System.out.println("-------------------------------------");
        
        System.out.println("days[o].compareTo(days[1]):" + days[0].compareTo(days[1]));
        System.out.println("days[o].compareTo(days[1]):" + days[0].compareTo(days[2]));
        
        Class<?> clazz = days[0].getDeclaringClass();
        System.out.println("clazz" + clazz);
        
        System.out.println("-------------------------------------");
        System.out.println("days[0].name():" + days[0].name());
        System.out.println("days[1].name():" + days[1].name());
        System.out.println("days[2].name():" + days[2].name());
        System.out.println("days[3].name():" + days[3].name());
        
        System.out.println("------------------------------------");
        System.out.println("days[0].toString():" + days[0].toString());
        System.out.println("days[1].toString():" + days[1].toString());
        System.out.println("days[2].toString():" + days[2].toString());
        System.out.println("days[3].toString():" + days[3].toString());
        
        System.out.println("--------------------------------------");
        Day d = Enum.valueOf(Day.class, days[1].name());
        Day d2 = Day.valueOf(Day.class, days[1].name());
        
        System.out.println("d:" + d);
        System.out.println("d2 : " + d2);
        
        System.out.println("-------------------------------------");
        System.out.println("days : " + Arrays.toString(days));
        
        System.out.println("------------------------------------");
        Day day = Day.valueOf("MONDAY");
        System.out.println("day:"+day);
        
        System.out.println("-------------------------------------");
        Enum e = Day.MONDAY;
        System.out.println("e:" + e);
        //无法调用， 没有此方法
        //e.values()
        
        if(clazz.isEnum()){
            Day[] dsz = (Day[]) clazz.getEnumConstants();
            System.out.println("dsz : " + Arrays.toString(dsz));
        }
    }

    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

}
