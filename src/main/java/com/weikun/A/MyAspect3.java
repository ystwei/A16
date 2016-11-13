package com.weikun.A;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * Created by Administrator on 2016/11/13.
 */
@Aspect
public class MyAspect3 {

    @Around("execution(* com.weikun.A..*.*(..))")
    public void ok(ProceedingJoinPoint jp) {

        System.out.println("环绕--before");
        try {
            Object os[]=jp.getArgs();
            os[0]="李四";
            jp.proceed(os);//调用核心方法
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("环绕--after");
    }
}
