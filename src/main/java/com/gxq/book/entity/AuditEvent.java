package com.gxq.book.entity;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.gxq.book.enumeration.AuditTypeEnum;
import com.gxq.book.enumeration.StatusEnum;

@Entity
@Table(name = "t_audit_log", catalog = "book")
public class AuditEvent implements Serializable {
	private static final long serialVersionUID = 1L;
	// Fields
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private Integer id;
	
	@Column(name = "USERID")
	private Integer userId;
	
	@Column(name = "USERNAME")
	private String userName;
	
	@Column(name = "DATETIME")
	private Date dateTime;
	
	@Column(name = "EVENT")
	private String event;
	
	@Column(name = "TYPE")
	@Enumerated(EnumType.STRING)
	private AuditTypeEnum type;
	
	@Column(name = "STATUS")
	@Enumerated(EnumType.STRING)
	private StatusEnum status;

	// Constructors

	/** default constructor */
	public AuditEvent() {
	}

	/** full constructor */
	public AuditEvent(Integer id, Integer userId, String userName, Date dateTime, String event) {
		this.id = id;
		this.userId = userId;
		this.userName = userName;
		this.dateTime = dateTime;
		this.event = event;
	}

	// Property accessors
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public AuditTypeEnum getType() {
		return type;
	}

	public void setType(AuditTypeEnum type) {
		this.type = type;
	}

	public StatusEnum getStatus() {
		return status;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}
}
