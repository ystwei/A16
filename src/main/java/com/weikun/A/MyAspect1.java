package com.weikun.A;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

/**
 * Created by Administrator on 2016/11/13.
 */
@Aspect
public class MyAspect1 {

    @AfterReturning( pointcut = "execution(* com.weikun.A.Chin*.say*(..)) &&args(msg1,msg2)",returning = "rvt")
    public void mark(String msg1,String msg2,Object rvt){
        System.out.println("连接点返回的方法:"+rvt);
    }
}
