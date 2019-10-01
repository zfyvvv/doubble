package com.zfy.consumer.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zfy.consumer.service.impl.TestServiceImpl;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext-dubbo.xml");
		//ͨ��spring��������
		TestServiceImpl t = ac.getBean("testServiceImpl",TestServiceImpl.class);
		t.test();
	}
}
