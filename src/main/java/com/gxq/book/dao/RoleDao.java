package com.gxq.book.dao;

import java.util.List;

import com.gxq.book.entity.Role;
import com.gxq.book.entity.User;


public interface RoleDao {

	public List<Role> getRoleList();
	
	public void saveRole(Role role);
	
	public void deleteRole(Integer id);
	
	public void updateRole(Role book);
	
	public Role getRoleById(Integer id);
	
	public void addUserRole(Integer roleId, User user);
	
	public void removeUserRole(Integer roleId, Integer userId);
}
