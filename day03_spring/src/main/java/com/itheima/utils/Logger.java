package com.itheima.utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Component("logger")
@Aspect
public class Logger {

    @Pointcut("execution(* com.itheima.service.impl.*.*(..)))")
    public void pt(){

    }

    @Around("pt()")
    public Object proceed(ProceedingJoinPoint pro){
        Object o = null;
        try {
            before();
            Object[] args = pro.getArgs();
            o = pro.proceed(args);
            after();
            return o;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            throwLogger();
        }finally {
            afterLogger();
        }
        return null;
    }
    public void before(){
        System.out.println("前置通知输出logger日志");
    }

    public void after(){
        System.out.println("后置通知输出logger");
    }

    public void throwLogger(){
        System.out.println("异常通知输入logger");
    }

    public void afterLogger(){
        System.out.println("最终通知输出logger");
    }

}
