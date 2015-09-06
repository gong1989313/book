package com.gxq.book.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gxq.book.dao.UserDao;
import com.gxq.book.entity.User;
import com.gxq.book.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao roleDao;
	
	@Override
	public List<User> getUserList() {
		return roleDao.getUserList();
	}

	@Override
	public void saveUser(User role) {
		roleDao.saveUser(role);
	}

	@Override
	public void deleteUser(int roleId) {
		roleDao.deleteUser(roleId);
	}

	@Override
	public void updateUser(User role) {
		roleDao.updateUser(role);
	}

	@Override
	public User getUserById(Integer id) {
		return roleDao.getUserById(id);
	}
}
