package com.gxq.book.service;

import java.util.List;

import com.gxq.book.entity.User;

public interface UserService {
public List<User> getUserList();
	
	public void saveUser(User user);
	
	public void deleteUser(int userId);
	
	public void updateUser(User user);
	
	public User getUserById(Integer userId);
}
