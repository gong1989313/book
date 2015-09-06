package com.gxq.book.dao.impl;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.gxq.book.dao.RoleDao;
import com.gxq.book.entity.Role;
import com.gxq.book.entity.User;


@Repository
public class RoleDaoImpl  implements RoleDao {
	
	private HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	@Autowired
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@SuppressWarnings("unchecked")
	public List<Role> getRoleList() {
		List<Role> list = (List<Role>)getHibernateTemplate().find("From Role");
		return list;
	}

	public void saveRole(Role Role) {
		getHibernateTemplate().save(Role);
		
	}

	public void deleteRole(Integer id) {
		getHibernateTemplate().delete(getRoleById(id));
		
	}

	public void updateRole(Role Role) {
		getHibernateTemplate().update(Role);
	}

	public Role getRoleById(Integer id) {
		Role Role = (Role)getHibernateTemplate().get(Role.class, id);
		return Role;
	}
	
	@Override
	public void addUserRole(Integer roleId, User user) {
		Role role = getRoleById(roleId);
		Set<User> users = role.getUsers();
		if(users != null && users.size() !=0){
			if(!users.contains(user)){
				users.add(user);
			}
		}else{
			users.add(user);
		}
		role.setUsers(users);
		updateRole(role);
	}
	
	@Override
	public void removeUserRole(Integer roleId, Integer userId) {
		Role role = getRoleById(roleId);
		Set<User> users = role.getUsers();
		if(role != null){
			for(User newUser : users){
				if(userId.equals(newUser.getId())){
					users.remove(newUser);
					role.setUsers(users);
					updateRole(role);
				}
			}
		}
	}
}
