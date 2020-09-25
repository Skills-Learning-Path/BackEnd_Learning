package com.dao;

import com.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
    List<User> getUserList();//查询全部用户
    User getUserById(int id);//根据id查询用户
    int addUser(User user);//插入用户
    int updateUser(User user);//修改用户
    int delUser(int id);//删除用户
    int addUser2(Map<String,Object> map);//万能map
    List<User> getUserLike(String value);//模糊查询
    List<User> getUserLimit(Map<String,Integer> map);//分页
    List<User> getUserLimit2();//分页
}
