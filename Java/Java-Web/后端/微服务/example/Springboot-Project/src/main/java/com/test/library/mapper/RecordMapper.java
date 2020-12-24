package com.test.library.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.test.library.pojo.Record;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface RecordMapper extends BaseMapper<Record>{
    int remove(@Param("id") int id);
    List<Record> query();
}
