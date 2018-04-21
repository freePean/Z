package cn.z.jiutian.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import com.alibaba.fastjson.JSON;

import cn.z.jiutian.BaseTest;
import cn.z.jiutian.entity.User;
import cn.z.jiutian.service.IUserService;

public class UserTest extends BaseTest{

    @Autowired
    private IUserService userService;

    @Test
    public void testUserList(){
       List<User> lists = userService.getAllUser(); 
       for (User user : lists) {
        System.out.println(JSON.toJSON(user));
    }
    }
}
