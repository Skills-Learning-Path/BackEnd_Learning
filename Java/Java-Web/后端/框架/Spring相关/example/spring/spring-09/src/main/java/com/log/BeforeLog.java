package com.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class BeforeLog implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        //method:要执行的目标对象的方法
        //args：参数
        //target：目标对象
        System.out.println(target.getClass().getName()+"--"+method.getName());
    }
}
