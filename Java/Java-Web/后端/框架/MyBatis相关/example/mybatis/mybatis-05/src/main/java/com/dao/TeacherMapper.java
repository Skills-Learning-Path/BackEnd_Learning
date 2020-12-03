package com.dao;

import com.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeacherMapper {
//    @Select("select * from teacher")
//    List<Teacher> getTeacher();

    Teacher getTeacher(@Param("tid") int id);
}
