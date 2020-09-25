package dao;


import com.dao.UserMapper;
import com.pojo.User;
import com.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MyTest {
    @Test
    public void test(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user1 = mapper.queryUserById(1);
        System.out.println(user1);
//        mapper.updateUser(new User(2,"aaaa","bbbb"));
        sqlSession.clearCache();
        System.out.println("------------------");
        User user2 = mapper.queryUserById(1);
        System.out.println(user2);
//        System.out.println(user1==user2);//true
        sqlSession.close();
    }
    @Test
    public void test2(){
        SqlSession sqlSession1 = MyBatisUtil.getSqlSession();
        SqlSession sqlSession2 = MyBatisUtil.getSqlSession();
        UserMapper mapper1 = sqlSession1.getMapper(UserMapper.class);
        User user1 = mapper1.queryUserById(1);
        System.out.println(user1);
        sqlSession1.close();
        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);
        User user2 = mapper2.queryUserById(1);
        System.out.println(user2);
        System.out.println(user1==user2);//true
        sqlSession2.close();
    }
}
