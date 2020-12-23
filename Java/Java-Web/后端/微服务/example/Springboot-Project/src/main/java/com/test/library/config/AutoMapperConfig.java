package com.test.library.config;

import com.github.dreamyoung.mprelation.AutoMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AutoMapperConfig {
    @Bean
    public AutoMapper autoMapper() {
        return new AutoMapper(new String[] { "com.test.library.pojo"}); //配置实体类所在目录（可多个,暂时不支持通过符*号配置）
    }
}