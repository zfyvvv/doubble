package com.zfy.consumer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zfy.consumer.service.TestService;
import com.zfy.dubbo.service.DemoService;

public class TestServiceImpl implements TestService{
	@Reference
	private DemoService demoService;
	@Override
	public void test() {
		//调用Provider中提供的功能|接口；
		String name = demoService.demo("张三");
		System.out.println(name);
	}
}
