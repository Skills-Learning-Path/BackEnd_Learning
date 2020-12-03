package com.dao;

import com.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> getUserList();//查询全部用户
    User getUserById(int id);//根据id查询用户
    int addUser(User user);//插入用户
    int updateUser(User user);//修改用户
    int delUser(int id);//删除用户

}
