package com.zfy.service.impl;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zfy.dubbo.service.DemoService;
import com.zfy.service.TestService;

@Service
public class TestServiceImpl implements TestService{
	
	//��ǰ�����
	//@Resource
	//private XxxMapper xxxMapper;
	
	//�����������
	@Reference
	private DemoService demoService;

	@Override
	public void test() {
		String name = demoService.demo("����");
		System.out.println(name);
	}
}
