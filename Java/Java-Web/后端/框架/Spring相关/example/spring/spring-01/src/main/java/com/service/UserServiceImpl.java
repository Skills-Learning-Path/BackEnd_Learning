package com.service;

import com.dao.UserDao;
import com.dao.UserDaoImpl;

public class UserServiceImpl implements UserService{
    private UserDao userDao;
    //利用set实现动态实现值的注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
