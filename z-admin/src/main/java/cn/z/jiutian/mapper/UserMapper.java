package cn.z.jiutian.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import cn.z.jiutian.entity.User;

@Repository
public interface UserMapper {


    User selectUserByUserId(@Param("userId") Integer userId);

    User selectUserByName(@Param("userName") String userName);

    List<User> selectAllUser();

    int deleteByPrimaryKey(@Param("id") Integer id);

    int insertSelective(User record);

    int updateByPrimaryKeySelective(User record);



}
