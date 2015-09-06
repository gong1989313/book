package com.gxq.book.dto;

import java.io.Serializable;
import java.util.Date;

import com.gxq.book.entity.AuditEvent;

public class AuditEventDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private int userId;
	private String userName;
	private String dateTime;
	private String type;
	private String event;
	private String status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public static AuditEventDto buildFrom(AuditEvent obj) {
		if(obj == null){
			return null;
		}
		AuditEventDto dto = new AuditEventDto();
		dto.setId(obj.getId());
		dto.setUserId(obj.getUserId());
		dto.setUserName(obj.getUserName());
		dto.setEvent(obj.getEvent());
		Date date = null;
		if((date = obj.getDateTime()) != null){
			dto.setDateTime(date.toString());
		}
		dto.setType(obj.getType().toString());
		dto.setStatus(obj.getStatus().toString());
		return dto;
	}

}
