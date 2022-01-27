package com.melnikov.spring.mvc_hibernate_aop.aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
@Aspect
public class MyLoggingAspect {

    @Around("com.melnikov.spring.mvc_hibernate_aop.aspect.MyPointCuts.allRepositoryMethods()")
    public Object aroundAllRepositoryMethodsAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        MethodSignature signature = (MethodSignature) proceedingJoinPoint.getSignature();

        String name = signature.getName();

        System.out.println("Begin of: " + name);

        Object proceed = proceedingJoinPoint.proceed();

        System.out.println("End of: " + name);

        return proceed;
    }
}
