package com.gxq.book.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class SecurityHandler  {
	@Pointcut("execution(* *(..))")
	private void addAddMethod(){}
	
	@Before("addAddMethod()")
	public void check(){
		System.out.println("check...");
	}
}
