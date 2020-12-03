package com.dao;

public class UserDaoOracle implements UserDao{
    @Override
    public void getUser() {
        System.out.println("Oracle getUser");
    }
}
