package cn.z.jiutian.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class MapReplace {

    @Test
    public void replaceTest(){
        Map<String,String> maps = new HashMap<String,String>();
        maps.put("1", "2");
        
        maps.replace("1", "2", "new value");
        
        for(Entry entry : maps.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }

}
