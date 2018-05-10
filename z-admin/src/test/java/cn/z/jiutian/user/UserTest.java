package cn.z.jiutian.user;

import java.util.List;

import javax.annotation.Resource;

import org.testng.annotations.Test;

import com.alibaba.fastjson.JSON;

import cn.z.jiutian.BaseTest;
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
}
