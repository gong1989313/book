package com.gxq.book.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gxq.book.dao.AuditEventDao;
import com.gxq.book.dto.AuditEventDto;
import com.gxq.book.entity.AuditEvent;
import com.gxq.book.service.AuditEventService;
import com.gxq.book.utils.PageModel;

@Service
public class AuditEventServiceImpl implements AuditEventService {

	@Autowired
	private AuditEventDao auditDao;

	@Override
	public PageModel<AuditEventDto> getList(int pageNo, int pageSize) {
		PageModel<AuditEventDto> pm = new PageModel<AuditEventDto>();
		pm.setPageSize(pageSize);
		pm.setPageNo(pageNo);
		List<AuditEvent> list = auditDao.getList((pageNo-1)*pageSize, pageSize);
		List<AuditEventDto> dtos = new ArrayList<AuditEventDto>();
		if(list != null && !list.isEmpty()){
			for(AuditEvent obj : list){
				AuditEventDto dto =  AuditEventDto.buildFrom(obj);
				dtos.add(dto);
			}
		}
		pm.setList(dtos);
		
		//get count
		int totalRecords = auditDao.getCount();
		pm.setTotalRecords(totalRecords);
		pm.setTotalPages(pm.getPages());
		return pm;
	}

	@Override
	public AuditEventDto getById(int id) {
		AuditEvent obj = auditDao.getById(id);
		return AuditEventDto.buildFrom(obj);
	}
}
