package com.gxq.book.action;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ExceptionMapping;
import org.apache.struts2.convention.annotation.ExceptionMappings;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;
import com.gxq.book.dto.BaseTypeDto;
import com.gxq.book.service.BookTypeService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@ParentPackage(value = "struts-default")
@Namespace("/bookType")
@ExceptionMappings({ @ExceptionMapping(exception = "java.lange.RuntimeException", result = "error") })
public class BookTypeAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	@Autowired
	private BookTypeService bookTypeService;
	
	public static String getUtf8FromIso8859_1(String value) throws UnsupportedEncodingException{
        return new String(value.getBytes("ISO8859-1"), "utf-8");
    }
	
	@Action(value = "baseView", results = { @Result(name = "success", location = "/views/tree/customerItem.jsp") })
	public void baseView() {
		List<BaseTypeDto> dtos = bookTypeService.getBaseType();
		String json = JSON.toJSONString(dtos);
		System.out.println(json);
		ActionContext context = ActionContext.getContext();
		HttpServletResponse response = (HttpServletResponse) context.get(ServletActionContext.HTTP_RESPONSE);
		/* 设置格式为text/json    */
		response.setContentType("text/json"); 
		/*设置字符集为'UTF-8'*/
		response.setCharacterEncoding("UTF-8"); 
		response.setHeader("Charset", "utf-8"); 
		try {
			response.getWriter().print(json);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public BookTypeService getBookTypeService() {
		return bookTypeService;
	}

	public void setBookTypeService(BookTypeService bookTypeService) {
		this.bookTypeService = bookTypeService;
	}
}
