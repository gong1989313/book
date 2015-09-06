package com.gxq.book.entity;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Book entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_bus_second_class", catalog = "book")
public class SecondClass implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Fields
	private Integer id;
	private String code;
	private String name;
	private Integer classId;
	private Integer parentId;
	
	public SecondClass() {
	}
	
	public SecondClass(Integer id, String code, String name, Integer classId, Integer parentId) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.classId = classId;
		this.parentId = parentId;
	}
	
	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name = "CODE")
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	@Column(name = "NAME")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "CLASSID")
	public Integer getClassId() {
		return classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	@Column(name = "PARENTID")
	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	
}
