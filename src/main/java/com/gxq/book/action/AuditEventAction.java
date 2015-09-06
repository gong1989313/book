package com.gxq.book.action;

import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ExceptionMapping;
import org.apache.struts2.convention.annotation.ExceptionMappings;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import com.gxq.book.dto.AuditEventDto;
import com.gxq.book.service.AuditEventService;
import com.gxq.book.utils.PageModel;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@ParentPackage(value = "json-default")
@Namespace("/audit")
@ExceptionMappings({ @ExceptionMapping(exception = "java.lange.RuntimeException", result = "error") })
public class AuditEventAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	@Autowired
	private AuditEventService service;
	
	private PageModel<AuditEventDto> dtos;   
	
	private AuditEventDto dto;  
	
	@Action(value = "auditView", results = { @Result(name = "success", location = "/views/audit/auditList.jsp") })
	public String auditView() {
		String pageNo = ServletActionContext.getRequest().getParameter("pageNo");
		String pageSize = ServletActionContext.getRequest().getParameter("pageSize");
		if(pageNo != null && pageSize != null){
			dtos = service.getList(Integer.parseInt(pageNo), Integer.parseInt(pageSize));
		}
		Map<String, Object> session = ActionContext.getContext().getSession();
		session.put("auditList", dtos);
		return SUCCESS;
	}
	
	@Action(value = "auditFind", results = { @Result(name = "success", location = "/views/audit/auditDetail.jsp") })
	public String findAudit() {
		String auditId = ServletActionContext.getRequest().getParameter("id");
		if(StringUtils.isNumeric(auditId)){
			dto = service.getById(Integer.parseInt(auditId));
		}
		Map<String, Object> session = ActionContext.getContext().getSession();
		session.put("auditDto",dto);
		return SUCCESS;
	}
	
	public AuditEventService getService() {
		return service;
	}

	public void setService(AuditEventService service) {
		this.service = service;
	}

	public PageModel<AuditEventDto> getDtos() {
		return dtos;
	}

	public void setDtos(PageModel<AuditEventDto> dtos) {
		this.dtos = dtos;
	}

	public AuditEventDto getDto() {
		return dto;
	}

	public void setDto(AuditEventDto dto) {
		this.dto = dto;
	}
}
