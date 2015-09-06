package com.gxq.book.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.gxq.book.dao.BookTypeDao;
import com.gxq.book.entity.BaseType;
import com.gxq.book.entity.BookType;
import com.gxq.book.entity.FirstClass;
import com.gxq.book.entity.SecondClass;


@Repository
public class BookTypeImpl  implements BookTypeDao {
	
	private HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	@Autowired
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	@Override
	public List<BaseType> getBaseType() {
		@SuppressWarnings("unchecked")
		List<BaseType> baseTypes = (List<BaseType>)getHibernateTemplate().executeFind(new HibernateCallback() {
			@Override
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				Query query = session.createQuery("From BaseType");
				return query.list();
			}
		});
		return baseTypes;
	}
	@Override
	public List<BookType> getBookTypeByBaseId(int baseId) {
		@SuppressWarnings("unchecked")
		List<BookType> bookTypes = (List<BookType>)getHibernateTemplate().executeFind(new HibernateCallback() {
			@Override
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				Query query = session.createQuery("From BookType b Where b.baseId =:baseId ");
				query.setParameter("baseId", baseId);
				return query.list();
			}
		});
		return bookTypes;
	}
	@Override
	public List<FirstClass> getFirstClassByTypeId(int typeId) {
		@SuppressWarnings("unchecked")
		List<FirstClass> firstClasses = (List<FirstClass>)getHibernateTemplate().executeFind(new HibernateCallback() {
			@Override
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				Query query = session.createQuery("From FirstClass b Where b.typeId =:typeId ");
				query.setParameter("typeId", typeId);
				return query.list();
			}
		});
		return firstClasses;
	}
	@Override
	public List<SecondClass> getSecondClassByFirstId(int firstId) {
		@SuppressWarnings("unchecked")
		List<SecondClass> secondClasses = (List<SecondClass>)getHibernateTemplate().executeFind(new HibernateCallback() {
			@Override
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				Query query = session.createQuery("From SecondClass b Where b.parentId =:firstId ");
				query.setParameter("firstId", firstId);
				return query.list();
			}
		});
		return secondClasses;
	}
	@Override
	public BaseType findBaseTypeById(int id) {
		BaseType baseType = (BaseType)getHibernateTemplate().execute(new HibernateCallback() {
			@Override
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				Query query = session.createQuery("From BaseType b Where b.id =:id ");
				query.setParameter("id", id);
				return query.uniqueResult();
			}
		});
		return baseType;
	}

}
