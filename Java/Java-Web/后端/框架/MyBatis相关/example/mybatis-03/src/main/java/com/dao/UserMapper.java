package com.dao;

import com.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("select * from user")
    List<User> getUserList();
    @Select("select * from user where id=#{id}")
    User getUserById(@Param("id") int id);//全部参数必须加上@Param
    @Insert("insert into user(id,username,password) values(#{id},#{username},#{password})")
    int addUser(User user);
    @Delete("delete from user where id=#{id}")
    int delUser(@Param("id") int id);
}
