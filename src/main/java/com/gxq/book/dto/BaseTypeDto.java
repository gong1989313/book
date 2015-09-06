package com.gxq.book.dto;

import java.io.Serializable;

import com.gxq.book.entity.BaseType;

public class BaseTypeDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String code;
	private String name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static BaseTypeDto buildFrom(BaseType base) {
		if(base == null){
			return null;
		}
		BaseTypeDto dto = new BaseTypeDto();
		dto.setId(base.getId());
		dto.setCode(base.getCode());
		dto.setName(base.getName());
		return dto;
	}

}
