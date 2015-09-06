package com.gxq.book.dao;

import java.util.List;

import com.gxq.book.entity.AuditEvent;

public interface AuditEventDao {
	public void save(AuditEvent auditEvent);
	
	public List<AuditEvent> getList(int pageNo, int pageSize);
	
	public AuditEvent getById(int id);
	
	public int getCount();
}
