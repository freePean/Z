package cn.z.jiutian.user;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableAsync;
import org.testng.annotations.Test;

import com.alibaba.fastjson.JSON;

import cn.z.jiutian.BaseTest;
import cn.z.jiutian.async.TestInterface;
import cn.z.jiutian.dao.UserDao;
import cn.z.jiutian.entity.User;

public class UserTest extends BaseTest{

    @Resource
    private UserDao userDao;

    @Test
    public void queryById(){
        User  u = userDao.queryById(2L);
        
        System.out.println(JSON.toJSON(u));
    }
    
    @Test
    public void queryAll(){
        List<User> lists = userDao.queryAll();
        
        for (User user : lists) {
            System.out.println(JSON.toJSON(user));
        }
    }
    
    private void execute(String... args){
        for (String str : args) {
            System.out.println(str);
        }
    }
    
    @Autowired private TestInterface testInterface;
    
    @Test
    public void testExecute(){
        execute("大名","小名","吼吼");
    }
    
 
    @Test
    public void test11() {
    	System.out.println("程序开始");
    	
    	testInterface.test1();
    	
    	System.out.println("----test1已经被执行-------");
    	
    	new Thread();
    	
    	System.out.println("------test()被执行-------");
    }
}
