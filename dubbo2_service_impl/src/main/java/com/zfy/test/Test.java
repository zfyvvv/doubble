package com.zfy.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.dubbo.container.Main;

public class Test {
	public static void main(String[] args) {
		//我们自己写的启动方式，但是启动后立即关闭，consumer不可调用；
		/*ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext-dubbo.xml");
		ac.start();
		System.out.println("strat up successed!");*/
		
		//官方推荐，
		//要求配置文件必须放在、META-INF/spring/*.xml
		Main.main(args);
		
	}

}
