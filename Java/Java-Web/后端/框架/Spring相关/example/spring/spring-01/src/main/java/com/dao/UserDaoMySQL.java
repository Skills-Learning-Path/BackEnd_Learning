package com.dao;

public class UserDaoMySQL implements UserDao{
    @Override
    public void getUser() {
        System.out.println("MySQL getUser");
    }
}
