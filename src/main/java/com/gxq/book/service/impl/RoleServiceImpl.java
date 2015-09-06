package com.gxq.book.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gxq.book.dao.RoleDao;
import com.gxq.book.dao.UserDao;
import com.gxq.book.entity.Role;
import com.gxq.book.entity.User;
import com.gxq.book.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleDao roleDao;
	
	@Autowired
	private UserDao userDao;

	@Override
	public List<Role> getRoleList() {
		return roleDao.getRoleList();
	}

	@Override
	public void saveRole(Role role) {
		roleDao.saveRole(role);
	}

	@Override
	public void deleteRole(int roleId) {
		roleDao.deleteRole(roleId);
	}

	@Override
	public void updateRole(Role role) {
		roleDao.updateRole(role);
	}

	@Override
	public Role getRoleById(Integer id) {
		return roleDao.getRoleById(id);
	}

	@Override
	public void addUserRole(Integer roleId, Integer userId) {
		User user = userDao.getUserById(userId);
		if(user != null){
			roleDao.addUserRole(roleId, user);
		}
	}

	@Override
	public void removeUserRole(Integer roleId, Integer userId) {
		roleDao.removeUserRole(roleId, userId);
	}

}
