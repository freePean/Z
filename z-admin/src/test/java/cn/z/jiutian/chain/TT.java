package cn.z.jiutian.chain;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @包名 :cn.z.jiutian.chain
 * @文件名 :TT.java 
 * TODO 类作用：
 * @系统名称 : 现金贷
 * @Author: wanglongxu 
 * @Date: 2018年5月8日 下午4:44:03
 * @版本号   :v0.0.01
 */
public class TT {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String, String>();
        
        map.put("1", "2");
        
        for (Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            
        }
    }

}
