package com.zfy.consumer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zfy.consumer.service.TestService;
import com.zfy.dubbo.service.DemoService;

public class TestServiceImpl implements TestService{
	@Reference
	private DemoService demoService;
	@Override
	public void test() {
		//����Provider���ṩ�Ĺ���|�ӿڣ�
		String name = demoService.demo("����");
		System.out.println(name);
	}
}
