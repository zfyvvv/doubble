package com.zfy.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.dubbo.container.Main;

public class Test {
	public static void main(String[] args) {
		//�����Լ�д��������ʽ�����������������رգ�consumer���ɵ��ã�
		/*ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext-dubbo.xml");
		ac.start();
		System.out.println("strat up successed!");*/
		
		//�ٷ��Ƽ���
		//Ҫ�������ļ�������ڡ�META-INF/spring/*.xml
		Main.main(args);
		
	}

}
