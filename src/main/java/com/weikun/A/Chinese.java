package com.weikun.A;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;

@Component
public class Chinese implements Person{
	//实现Person接口的sayHello()方法
	public String sayHello(String name,String sex){
		//返回简单的字符串
		System.out.println("sayHello----"+name);
		return name + " Hello , Spring AOP";
	}
	//定义一个eat()方法
	public void say(String food){
		//System.out.print(5/0);
		System.out.println("我正在吃:"	+ food);
	}
}