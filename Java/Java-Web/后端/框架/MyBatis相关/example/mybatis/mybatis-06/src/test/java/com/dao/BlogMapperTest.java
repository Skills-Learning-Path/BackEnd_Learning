package com.dao;

import com.pojo.Blog;
import com.util.IDUtil;
import com.util.MyBatisUtil;
import org.apache.ibatis.cache.Cache;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;

public class BlogMapperTest {
    @Test
    public void addBlogTest() {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog = new Blog();
        blog.setId(IDUtil.getId());
        blog.setTitle("Mybatis");
        blog.setAuthor("狂神说");
        blog.setCreateTime(new Date());
        blog.setViews(9999);

        mapper.addBlog(blog);

        blog.setId(IDUtil.getId());
        blog.setTitle("Java");
        mapper.addBlog(blog);

        blog.setId(IDUtil.getId());
        blog.setTitle("Spring");
        mapper.addBlog(blog);

        blog.setId(IDUtil.getId());
        blog.setTitle("微服务");
        mapper.addBlog(blog);

        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void testif(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map<String, String> map = new HashMap<>();
//        map.put("title","Java");
        map.put("author","abc");
        List<Blog> list = mapper.queryBlogIf(map);
        for (Blog blog : list) {
            System.out.println(blog);
        }
        sqlSession.close();
    }
    @Test
    public void testchoose(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map<String, String> map = new HashMap<>();
//        map.put("title","Java");
        map.put("author","abc");
//        map.put("views","9999");
        List<Blog> list = mapper.queryBlogChoose(map);
        for (Blog blog : list) {
            System.out.println(blog);
        }
        sqlSession.close();
    }
    @Test
    public void testset(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map<String, String> map = new HashMap<>();
        map.put("title","testu");
        map.put("id","8ca44da6617b4920a82a5d1d0df03142");
        mapper.updateBlog(map);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void testForeach(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        Map<String, ArrayList<Integer>> map = new HashMap<>();
        ArrayList<Integer> ids = new ArrayList<>();
        ids.add(1);
        ids.add(2);
        map.put("ids",ids);
        mapper.queryBlogForeach(map);
        sqlSession.close();


    }
}
