package com.wangxile.springaop.aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Author:wangqi
 * @Description:
 * @Date:Created in 2019/7/12
 * @Modified by:
 */
//@Component
//@Aspect
public class XileAspectj {

    @Pointcut("execution(* com.wangxile.springaop.service..*.*(..))")
    public void pointCut(){

    }

    @Before("pointCut()")
    public void before(){
        System.out.println("aop-before");
    }
}
