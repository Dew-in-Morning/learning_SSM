package com.lieyan.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.sql.Time;

@Component
@Aspect
public class ProjectAdvice {
    @Pointcut("execution(* com.lieyan.Service.*Service.*(..))")
    private void p1(){};

    @Around("p1()")
    public Object runSpeed(ProceedingJoinPoint pjp) throws Throwable {
        long t1=System.currentTimeMillis();

        Object rt = pjp.proceed();
        long t2=System.currentTimeMillis();
        long result = t2 - t1;
        System.out.println("运行时间："+result);
        return rt;
    }
}
