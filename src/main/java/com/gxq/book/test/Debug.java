package com.gxq.book.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Debug {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/*.xml");
        Business business = (Business) context.getBean("business");
        business.delete("猫");
	}
}
