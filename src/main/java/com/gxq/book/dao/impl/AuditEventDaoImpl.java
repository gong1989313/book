package com.gxq.book.dao.impl;

import java.math.BigInteger;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.gxq.book.dao.AuditEventDao;
import com.gxq.book.entity.AuditEvent;

@Repository
public class AuditEventDaoImpl implements AuditEventDao {
	
	private HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	@Autowired
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	@Override
	public void save(AuditEvent auditEvent) {
		getHibernateTemplate().save(auditEvent);
	}

	@Override
	public List<AuditEvent> getList(int pageNo, int pageSize) {
		@SuppressWarnings("unchecked")
		List<AuditEvent> auditEvents = (List<AuditEvent>)getHibernateTemplate().executeFind(new HibernateCallback() {
			@Override
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				Query query = session.createQuery("From AuditEvent order by dateTime desc");
				query.setFirstResult(pageNo);
				query.setMaxResults(pageSize);
				return query.list();
			}
		});
		return auditEvents;
	}
	
	public int getCount() {
		BigInteger result = (BigInteger) getHibernateTemplate().execute(new HibernateCallback() {
			@Override
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				SQLQuery query = session.createSQLQuery("select count(1) From t_audit_log"); 
				return query.uniqueResult();
			}
		});
		return result.intValue();
	}
	@Override
	public AuditEvent getById(int id) {
		AuditEvent obj = (AuditEvent)getHibernateTemplate().get(AuditEvent.class, id);
		return obj;
	}
}
