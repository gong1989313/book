package com.gxq.book.dao;

import java.util.List;

import com.gxq.book.entity.User;

public interface UserDao {

	public List<User> getUserList();
	
	public void saveUser(User book);
	
	public void deleteUser(Integer id);
	
	public void updateUser(User book);
	
	public User getUserById(Integer id);
}
