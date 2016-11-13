package com.weikun.A;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2016/11/13.
 */
public class Test {


    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext1.xml");
        Person p=(Person)ctx.getBean("chinese");

        p.say("菠萝");

        p.sayHello("张三","");
    }
}
