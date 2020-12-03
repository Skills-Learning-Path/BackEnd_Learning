package com.dao;

import com.pojo.Student;
import com.pojo.Teacher;
import com.util.MyBatisUtil;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest {
    @Test
    public void testSelectTeacher(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);
        sqlSession.close();
    }

    @Test
    public void testSelectStudent(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = mapper.getStudentInfo();
        for (Student student : students) {
            System.out.println(student);
        }
        sqlSession.close();
    }
}
