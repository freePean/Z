package cn.z.jiutian.listRemove;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.Test;

import com.alibaba.fastjson.JSON;

import cn.z.jiutian.BaseTest;

public class ListRemoveTest extends BaseTest{

    /*
     * List.remove() 反例
     */
    @Test
    public void listRemoveTest1(){
        List<String> lists = new ArrayList<String>();
        lists.add("1");
        lists.add("2");
        
        for(String item : lists){
            if("2".equals(item)){
                lists.remove(item);
                // modCount = 3
            }
        }
        
        System.out.println(JSON.toJSON(lists));
    }

    /*
     * 上例子正确写法
     */
    @Test
    public void listToIteratorTest(){
        List<String> lists = new ArrayList<String>();
        lists.add("1");
        lists.add("2");
        
        Iterator<String> iterators = lists.iterator();
        
        while(iterators.hasNext()){
            String str = iterators.next();
            if("2".equals(str)){
                iterators.remove();
            }
        }
        
        System.out.println(JSON.toJSON(lists));
    }
}
