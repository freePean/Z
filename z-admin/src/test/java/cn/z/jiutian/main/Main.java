package cn.z.jiutian.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.alibaba.fastjson.JSON;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        
        Iterator<String> iterator = list.iterator();
        
        while(iterator.hasNext()){
            String item = iterator.next();
            if("2".equals(item)){
                iterator.remove();
            }
        }
        System.out.println(JSON.toJSON(list));
    }

}
