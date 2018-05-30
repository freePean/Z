package cn.z.jiutian.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.alibaba.fastjson.JSON;

import cn.z.jiutian.BaseTest;

public class ArrayListTest extends BaseTest{

    private static final Logger LOG = LoggerFactory.getLogger(ArrayListTest.class);
    
    @Test
    public void removeListTest(){
        List<String> lists = new ArrayList<String>();
        lists.add("1");
        lists.add("2");
        
        for (String  item: lists) {
            if("2".equals(item)){
                lists.remove(item);
            }
        }
        for (String item : lists) {
            LOG.info("item is {}", item);
        }
    }
    
    @Test
    public void newRemoveListTest(){
        List<String> lists = new ArrayList<String>();
        lists.add("1");
        lists.add("2");
        Iterator<String> iterators = lists.iterator();
        while(iterators.hasNext()){
            String item = iterators.next();
            if("2".equals(item)){
                iterators.remove();
            }
        }
        
        for (String item : lists) {
            LOG.info("item is {}", item);
        }
    }
    
}
