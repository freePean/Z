package cn.z.jiutian.dao;

import java.util.List;

import cn.z.jiutian.entity.User;

public interface UserDao {

    User queryById( long id);

    List<User> queryAll();
}
