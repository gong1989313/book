package com.gxq.book.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gxq.book.entity.Role;
import com.gxq.book.entity.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/*.xml" })
public class RoleDaoTest {
	@Autowired(required = true)
	private UserDao userDao;
	
	@Autowired(required = true)
	private RoleDao roleDao;

	@Test
	public void testSaveRoleList() {
		/*Role role = new Role();
		role.setCode("test");
		role.setName("test");
		roleDao.saveRole(role);
		System.out.println("save ok");*/
	}
	
	@Test
	public void testGetRoleList() {
		List<Role> roles = roleDao.getRoleList();
		System.out.println(roles.toString());
	}
	
	@Test
	public void testAddUserRole() {
		/*User user = userDao.getUserById(1);
		Role role = roleDao.getRoleById(1);
		roleDao.addUserRole(role.getId(), user);
		testGetRoleList();*/
	}
	
	@Test
	public void testRemoveUserRole() {
	/*	User user = userDao.getUserById(1);
		Role role = roleDao.getRoleById(1);
		roleDao.removeUserRole(role.getId(), user.getId());
		testGetRoleList();*/
	}
}
