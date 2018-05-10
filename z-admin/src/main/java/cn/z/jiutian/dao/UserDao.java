package cn.z.jiutian.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.z.jiutian.entity.User;

public interface UserDao {

    User queryById(@Param("id") long id);

    List<User> queryAll();
}
