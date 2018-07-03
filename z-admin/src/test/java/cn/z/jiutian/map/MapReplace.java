package cn.z.jiutian.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class MapReplace {

    private static final Logger LOG = LoggerFactory.getLogger(MapReplace.class);
    
    @Test
    public void replaceTest(){
        Map<String,String> maps = new HashMap<String,String>();
        maps.put("1", "Doug");
        maps.put("2", "joy");
        maps.put("3", "linda");
        
        /*
         * 1
         */
        for(Map.Entry<String, String> entry : maps.entrySet()){
            LOG.info("maps 1 遍历    key : " + entry.getKey() + ", value : " + entry.getValue());
        }
        System.out.println("----------------------------------------------------------------------------");
        /*
         * 2
         */
        for(String str : maps.keySet()){
            LOG.info("maps 2 遍历   key : " + str + ", value : " + maps.get(str));
        }
        System.out.println("----------------------------------------------------------------------------");
        /*
         * 3
         */
        Iterator<Map.Entry<String, String>> iterators = maps.entrySet().iterator();
        System.out.println("----------------------------------------------------------------------------");
        while(iterators.hasNext()){
            Map.Entry<String, String> entry = iterators.next();
            
            LOG.info("maps 3 遍历    key : " + entry.getKey() + ", value : " + entry.getValue());
        }
        
        /**
         * 4
         */
        System.out.println("----------------------------------------------------------------------------");
        for(String str : maps.values()){
            LOG.info("maps 4 遍历   value : " + str);
        }
    }

}
