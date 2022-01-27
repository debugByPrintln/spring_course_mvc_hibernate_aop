package com.melnikov.spring.mvc_hibernate_aop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointCuts {
    @Pointcut("execution(* com.melnikov.spring.mvc_hibernate_aop.dao.*.*(..))")
    public void allRepositoryMethods(){}
}
