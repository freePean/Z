package cn.z.jiutian.jdk8;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import cn.z.jiutian.BaseTest;

/**
 * @包名 :cn.z.jiutian.jdk8
 * @文件名 :NullTest.java 
 * TODO 类作用：
 * @系统名称 : 现金贷
 * @Author: wanglongxu 
 * @Date: 2018年6月5日 下午9:50:13
 * @版本号   :v0.0.01
 */
public class NullTest extends BaseTest{

    private static final Logger LOG = LoggerFactory.getLogger(NullTest.class);

    @Test
    public void nullTest(){
        User u = new User();
        LOG.info("---------------", u.getName().equals(null));//报java.lang.NullPointerException
    }
    
    class User{
        
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    
    @Test
    public void equalTest(){
        User u = new User();
        LOG.info("-----------", u.getName() == null);
        if(u.getName() == null){
            LOG.info("------------sss----------", 1==1);
            System.out.println(u.getName() == null);
            System.out.println(1==1);
        }
    }
    
    @Test
    public void equalTest1(){
        User u = new User();
        LOG.info("------------", u.getName().equals(""));
    }
    
    @Test
    public void equalTest2(){
        User u = new User();
        System.out.println(StringUtils.isBlank(u.getName()));
        
    }
}