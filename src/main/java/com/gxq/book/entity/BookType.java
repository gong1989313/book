package com.gxq.book.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import static javax.persistence.GenerationType.IDENTITY;

/**
 * Book entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_bus_type", catalog = "book")
public class BookType implements Serializable {
	private static final long serialVersionUID = 1L;
	// Fields
	private Integer id;
	private String code;
	private String name;
	private Integer baseId;

	// Constructors

	/** default constructor */
	public BookType() {
	}

	/** full constructor */
	public BookType(String code, String name, Integer baseId) {
		this.name = name;
		this.code = code;
		this.baseId = baseId;
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
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	@Column(name = "BASEID")
	public Integer getBaseId() {
		return baseId;
	}

	public void setBaseId(Integer baseId) {
		this.baseId = baseId;
	}
}
