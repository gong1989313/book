package com.gxq.book.action;

import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;

import org.apache.struts2.StrutsSpringTestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LoginActionTest extends StrutsSpringTestCase {
	// @Autowired
	// private LoginAction loginAction;

	@Before
	public void setUp() {
		getContextLocation();
	}

	// 在执行每个test之后，都要执行tearDown
	@After
	public void tearDown() {
	}

	// 这个是单元测试方法，一个方法测试一个功能或者一个action
	/*
	 * request是类StrutsSpringTestCase的成员变量，是MockHttpServletRequest对象
	 * 在这里mock出来的一个web中的一个request 通过,request.setParameter("userId",
	 * "1");来模拟web传入的参数 通过executeAction("/user/*Action!*.action");来模拟调用web链接
	 */
	@Test
	public void testLogin() throws UnsupportedEncodingException, ServletException {
		//request.setParameter("loginname", "gsdhaiji_cai");
		//request.setParameter("pwd", "123");
		//String result = executeAction("/user/login.action");
		//assertEquals("\"{}\"", result);
	}
	
	protected String getContextLocation() {  
        return "classpath*:applicationContext*.xml";  
    } 
}
