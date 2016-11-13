package com.weikun.A;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Bean;
import org.springframework.expression.Expression;

/**
 * Created by Administrator on 2016/11/13.
 */
@Aspect
public class MyAspect {

    @Before("execution(* com.weikun.A.*.*(..))")
    void ok(){
        System.out.println("Before");
    }
    @After("execution(* com.weikun.A.*.*(..))")
    void go(){
        System.out.println("After");
    }

}
