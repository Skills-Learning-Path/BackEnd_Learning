package com.example.shiro02.config;

import at.pollux.thymeleaf.shiro.dialect.ShiroDialect;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

@Configuration
public class ShiroConfig {
    @Bean(name = "shiroFilterFactoryBean")
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(@Qualifier("getDefaultWebSecurityManager") DefaultWebSecurityManager defaultWebSecurityManager){
        ShiroFilterFactoryBean subject = new ShiroFilterFactoryBean();
        subject.setSecurityManager(defaultWebSecurityManager);

        //添加 Shiro 的内置过滤器=======================
        /*
            anon : 无需认证，就可以访问
            authc : 必须认证，才能访问
            user : 必须拥有 “记住我”功能才能用
            perms : 拥有对某个资源的权限才能访问
            role : 拥有某个角色权限才能访问
         */
        Map<String, String> map = new LinkedHashMap<>();
        map.put("/user/add","perms[user:add]");
        map.put("/user/update","perms[user:update]");
        // 设置 /user/add 这个请求,只有认证过才能访问
//        map.put("/user/add","authc");
//        map.put("/user/update","authc");
        // 设置 /user/ 下面的所有请求,只有认证过才能访问
        map.put("/user/*","authc");
        subject.setFilterChainDefinitionMap(map);
        // 设置登录的请求
        subject.setLoginUrl("/toLogin");
        //设置未授权请求
        subject.setUnauthorizedUrl("/error");
//============================================
        return subject;
    }

    @Bean
    public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("userRealm") UserRealm userRealm){
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        //关联realm
        securityManager.setRealm(userRealm);
        return securityManager;
    }

    @Bean
    public UserRealm userRealm(){
        return new UserRealm();
    }
    @Bean
    public ShiroDialect getShiroDialect(){
        return new ShiroDialect();
    }
}
