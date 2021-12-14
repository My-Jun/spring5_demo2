package com.junjay.spring5.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.junjay.spring5.config.SpringConfig;
import com.junjay.spring5.service.UserService;

public class TextBean {

	@Test
	public void testUserService() {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
		UserService userService = context.getBean("userService", UserService.class);
		System.out.println("∂‘œÛ£∫"+userService);
		userService.add();
	}
	
	@Test
	public void testConfig() {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		UserService userService = context.getBean("userService", UserService.class);
		userService.add();
	}

}
