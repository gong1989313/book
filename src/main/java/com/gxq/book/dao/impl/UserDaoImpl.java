package com.gxq.book.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.gxq.book.dao.UserDao;
import com.gxq.book.entity.User;


@Repository
public class UserDaoImpl  implements UserDao {
	
	private HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	@Autowired
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@SuppressWarnings("unchecked")
	public List<User> getUserList() {
		List<User> list = (List<User>)getHibernateTemplate().find("From User");
		return list;
	}

	public void saveUser(User User) {
		getHibernateTemplate().save(User);
		
	}

	public void deleteUser(Integer id) {
		getHibernateTemplate().delete(getUserById(id));
		
	}

	public void updateUser(User User) {
		getHibernateTemplate().update(User);
	}

	public User getUserById(Integer id) {
		User User = (User)getHibernateTemplate().get(User.class, id);
		return User;
	}
}
