package com.mybatisplus;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mybatisplus.mapper.UserMapper;
import com.mybatisplus.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private UserMapper userMapper;
    @Test
    void contextLoads() {
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }
    @Test
    public void testInsert(){
        User user = new User();
        user.setName("abc");
        user.setAge(12);
        user.setEmail("123@123");
        int result = userMapper.insert(user);//自动生成id
        System.out.println(result);//受影响的行数
        System.out.println(user);
    }
    @Test
    public void testUpdate(){
        User user = new User();
        //通过条件自动拼接动态sql
        user.setId(1334399101453889538L);
        user.setName("def");
        int result = userMapper.updateById(user);
        System.out.println(result);//受影响的行数

    }
    @Test
    public void testLock(){
        User user = userMapper.selectById(1L);
        user.setName("qqq");
        userMapper.updateById(user);
    }
    @Test
    public void testselect(){
        User user = userMapper.selectById(1L);
        System.out.println(user);
        List<User> users = userMapper.selectBatchIds(Arrays.asList(1, 2, 3));
        users.forEach(System.out::println);
        Map<String, Object> map = new HashMap<>();
        map.put("name","abc");
        List<User> userList = userMapper.selectByMap(map);
        userList.forEach(System.out::println);
    }
    @Test
    public void testSelectPage(){
        Page<User> page = new Page<>(2,3);//参数一：当前页，参数二：页面大小
        userMapper.selectPage(page,null);
        page.getRecords().forEach(System.out::println);
    }
    @Test
    public void testDeleteById(){
        userMapper.deleteById(1L);
    }
    @Test
    public void testDeleteMap(){
        Map<String, Object> map = new HashMap<>();
        map.put("name","abc");
        int res = userMapper.deleteByMap(map);
        System.out.println(res);
    }
}
