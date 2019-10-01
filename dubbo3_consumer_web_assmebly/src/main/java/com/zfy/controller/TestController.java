package com.zfy.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zfy.service.TestService;

@Controller
public class TestController {
	
	@Resource
	private TestService testServiceImpl;
	@RequestMapping("/test")
	public String test() {
		testServiceImpl.test();
		return "main.jsp";
	}
}
