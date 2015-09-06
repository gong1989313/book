package com.gxq.book.service;

import com.gxq.book.dto.AuditEventDto;
import com.gxq.book.utils.PageModel;

public interface AuditEventService {
	public PageModel<AuditEventDto> getList(int pageNo, int pageSize);

	public AuditEventDto getById(int id);
}
