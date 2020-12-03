package com.mapper;

import com.pojo.User;

import java.util.List;

public interface UserMapper {
    public List<User> selectUser();
    public int addUser(User user);
    public int delUser(int id);
}
