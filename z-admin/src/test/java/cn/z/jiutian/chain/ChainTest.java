package cn.z.jiutian.chain;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import com.sun.javafx.collections.MappingChange.Map;

import cn.z.jiutian.BaseTest;

public class ChainTest extends BaseTest{

    @Autowired
    private OrderService orderService;
    
    @Test
    public void chainTest(){
        orderService.execute();
    }

    @Test
    public void moveChainTest(){
        List<Object> lists = getObject(3);
        OrderVo param = new OrderVo();
        
        Chain<OrderVo> chain = null;
        Chain<OrderVo> nextChain = null;
        
        for(int i = 0; i < lists.size(); i++){
            if(i < lists.size() - 1){
                chain = (Chain<OrderVo>) lists.get(i);
                nextChain = (Chain<OrderVo>) lists.get(i + 1);
                chain.setNext(nextChain);
            }
        }
        chain = (Chain<OrderVo>) lists.get(0);
        
        chain.next(param);
        
    }
    
    public List<Object> getObject(Integer code){
        List<Object> lists = new ArrayList<Object>();
        java.util.Map<Integer, Class<?>> maps = ChainEnum.getEnums(code);
        
        for(Entry<Integer, Class<?>> entry: maps.entrySet()){
            try {
                lists.add(entry.getValue().newInstance());
            } catch (InstantiationException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
        return lists;
    }
}
