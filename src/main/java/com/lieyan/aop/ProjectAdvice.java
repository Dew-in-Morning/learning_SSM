package com.lieyan.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.sql.Array;
import java.sql.Time;
import java.util.Arrays;

@Component
@Aspect
public class ProjectAdvice {
    @Pointcut("execution(* com.lieyan.Service.*Service.*(..))")
    private void p1(){};

//    @Before("p1()")
    public void before(JoinPoint jp){
        Object[] args = jp.getArgs();
        System.out.println(Arrays.toString(args));
    }
//    @After("p1()")
    public void after(JoinPoint jp){
        Object[] args = jp.getArgs();
        System.out.println(Arrays.toString(args));
    }
    @AfterReturning(value = "p1()",returning = "ret")
    public void afterReturning(String ret){
        System.out.println("returning:"+ret);
    }
    @AfterThrowing(value = "p1()",throwing = "t")
    public void afterThrowing(Throwable t){
        System.out.println("throwing:"+t);
    }
//    @Around("p1()")
    public Object runSpeed(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        System.out.println(Arrays.toString(args));
        long t1=System.currentTimeMillis();

        Object rt = pjp.proceed();
        long t2=System.currentTimeMillis();
        long result = t2 - t1;
        System.out.println("运行时间："+result);
        return rt;
    }
}
