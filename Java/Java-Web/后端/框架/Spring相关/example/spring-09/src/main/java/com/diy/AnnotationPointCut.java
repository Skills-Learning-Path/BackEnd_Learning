package com.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect//标注这个类是一个切面
public class AnnotationPointCut {
    @Before("execution(* com.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("===before===");
    }
    @After("execution(* com.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("===after===");
    }
    //在环绕增强中，可以给定一个参数，代表我们要处理切入的点
    @Around("execution(* com.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("===around before===");
        System.out.println(jp.getSignature());
        jp.proceed();//执行方法
        System.out.println("===around after===");
    }
}
