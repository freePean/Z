package cn.z.jiutian.md5;

import com.alibaba.fastjson.JSON;

public class Test1 {


//    public static void main(String[] args) {
//        Person p = new Person();
//        p.setHa("nima");
//        p.setSex("nv");
//        List<yellow> list = new ArrayList<yellow>();
//        yellow y = new yellow();
//        y.setCountry("111");
//        y.setName("john");
//        list.add(y);
//        p.setList(list);
//        
//        System.out.println(JSON.toJSON(p));
//    }
    
    public static void main(String[] args) {
        String str = "";
        str = str.replace("\\", "").replace("\"[", "[").replace("]\"", "]");
        
        System.out.println(str);
        BorrowInfo bo = JSON.parseObject(str, BorrowInfo.class);
        System.out.println(JSON.toJSON(bo));
    }
    
//    public static void main(String[] args) {
//        String str = null;
//        Person p = JSON.parseObject(str, Person.class);
//        
//        System.out.println(JSON.toJSON(p));
//    }
}
