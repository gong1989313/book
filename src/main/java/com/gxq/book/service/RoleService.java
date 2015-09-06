package com.gxq.book.service;

import java.util.List;

import com.gxq.book.entity.Role;

public interface RoleService {
public List<Role> getRoleList();
	
	public void saveRole(Role role);
	
	public void deleteRole(int roleId);
	
	public void updateRole(Role role);
	
	public Role getRoleById(Integer roleId);
	
	public void addUserRole(Integer roleId, Integer userId);
	
	public void removeUserRole(Integer roleId, Integer userId);
}
