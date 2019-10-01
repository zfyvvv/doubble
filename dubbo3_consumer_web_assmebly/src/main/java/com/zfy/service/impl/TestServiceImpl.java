package com.zfy.service.impl;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zfy.dubbo.service.DemoService;
import com.zfy.service.TestService;

@Service
public class TestServiceImpl implements TestService{
	
	//以前是这个
	//@Resource
	//private XxxMapper xxxMapper;
	
	//现在是这个；
	@Reference
	private DemoService demoService;

	@Override
	public void test() {
		String name = demoService.demo("李四");
		System.out.println(name);
	}
}
