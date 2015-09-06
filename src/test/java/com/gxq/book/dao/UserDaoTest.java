package com.gxq.book.dao;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gxq.book.entity.User;
import com.gxq.book.enumeration.AccountStatus;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/*.xml" })
public class UserDaoTest {
	@Autowired(required = true)
	private UserDao userDao;
	
	/*@Test
	public void testSaveUser() {
		User user = new User();
		user.setAddress("address1111");
		user.setName("test");
		user.setUserName("username");
		user.setCreateDate(new Date());
		user.setPassword("test");
		user.setStatus(AccountStatus.ACTIVE);
		userDao.saveUser(user);
		System.out.println("save ok");
	}*/
	
	@Test
	public void testGetUserList() {
		List<User> users = userDao.getUserList();
		System.out.println(users.toString());
	}
}
