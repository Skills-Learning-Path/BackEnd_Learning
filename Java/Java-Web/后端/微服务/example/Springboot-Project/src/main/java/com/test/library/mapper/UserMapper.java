package com.test.library.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.test.library.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<User> {
}
