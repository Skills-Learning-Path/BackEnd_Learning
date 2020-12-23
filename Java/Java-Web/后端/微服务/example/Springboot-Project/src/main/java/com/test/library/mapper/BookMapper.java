package com.test.library.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.test.library.pojo.Book;
import org.springframework.stereotype.Repository;

@Repository
public interface BookMapper extends BaseMapper<Book> {
}
