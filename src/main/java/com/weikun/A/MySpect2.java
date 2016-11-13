package com.weikun.A;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

/**
 * Created by Administrator on 2016/11/13.
 */
@Aspect
public class MySpect2 {

    @AfterThrowing(pointcut="execution(* com.weikun.A.*.*(..))"
            , throwing="ex")
    public void go1(Throwable ex){
        System.out.println("出现了异常，它的异常是："+ex);
    }
}
