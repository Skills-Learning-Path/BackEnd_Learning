package com.mybatisplus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mybatisplus.mapper.UserMapper;
import com.mybatisplus.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
public class WrapperTest {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void contextLoads(){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper
                .isNotNull("name")
                .isNotNull("age")
                .ge("age",12);
        userMapper.selectList(wrapper).forEach(System.out::println);
    }
    @Test
    public void test2(){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("name","Jack");
        System.out.println(userMapper.selectOne(wrapper));
    }
    @Test
    public void test3(){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.between("age",20,30);
        Integer count = userMapper.selectCount(wrapper);
        System.out.println(count);
    }
    @Test
    public void test4(){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.notLike("name","e").likeRight("email","t");
        List<Map<String, Object>> maps = userMapper.selectMaps(wrapper);
        maps.forEach(System.out::println);
    }
    @Test
    public void test5(){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.inSql("id","select id from user where id<3");
        userMapper.selectList(wrapper).forEach(System.out::println);
    }
    @Test
    public void test6(){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.orderByDesc("id");
        userMapper.selectList(wrapper).forEach(System.out::println);
    }
}
