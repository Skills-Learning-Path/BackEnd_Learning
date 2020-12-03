package com.dao;

import com.pojo.User;
import com.util.MyBatisUtil;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDaoTest {
    @Test
    public void test(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> userList = userDao.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }
    @Test
    public void testId(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        User user = userDao.getUserById(1);
        System.out.println(user);
        sqlSession.close();
    }
    @Test
    public void testAdd(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        int res = userDao.addUser(new User(3, "hhh", "111111"));
        if(res>0){
            System.out.println("Success");
        }
        sqlSession.commit();//提交事务
        sqlSession.close();
    }
    @Test
    public void testUpdate(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        userDao.updateUser(new User(3,"aaabb","123123"));
        sqlSession.commit();//提交事务
        sqlSession.close();
    }
    @Test
    public void testdel(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        userDao.delUser(3);
        sqlSession.commit();//提交事务
        sqlSession.close();
    }
    @Test
    public void add2(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        Map<String, Object> map = new HashMap<>();
        map.put("id",3);
        map.put("password","121333");
        map.put("username","add");
        userDao.addUser2(map);
        sqlSession.commit();//提交事务
        sqlSession.close();
    }
    @Test
    public void like(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> users = userDao.getUserLike("a");
        for (User user : users) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void testLimit(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        Map<String, Integer> map = new HashMap<>();
        map.put("startIndex",1);
        map.put("pageSize",2);
        List<User> list = userDao.getUserLimit(map);
        for(User user:list){
            System.out.println(user);
        }
        sqlSession.close();
    }
    @Test
    public void testLimit2(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        RowBounds rowBounds = new RowBounds(1, 2);
        List<User> list = sqlSession.selectList("com.dao.UserDao.getUserLimit2",null,rowBounds);
        for(User user:list){
            System.out.println(user);
        }
        sqlSession.close();
    }
}
