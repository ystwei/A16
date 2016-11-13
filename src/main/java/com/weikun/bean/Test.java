package com.weikun.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.net.SocketPermission;

/**
 * Created by Administrator on 2016/11/13.
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        StoneAxe stone=(StoneAxe)ctx.getBean("stoneAxe");

        Chinese chinese=(Chinese)ctx.getBean("chinese");
        System.out.print(chinese);

//        Chinese chinese1=(Chinese)ctx.getBean("chinese");
//        System.out.print(chinese1);

        //chinese.setAxe(stone);
        chinese.useAxe();



    }
}
