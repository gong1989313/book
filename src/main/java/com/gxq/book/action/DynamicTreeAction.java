package com.gxq.book.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
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
import com.gxq.book.dto.ZtreeBean;
import com.opensymphony.xwork2.ActionSupport;

@ParentPackage(value = "struts-default")
@Namespace("/tree")
@ExceptionMappings({ @ExceptionMapping(exception = "java.lange.RuntimeException", result = "error") })
public class DynamicTreeAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	@Autowired
	/*private BookTypeService bookTypeService;
	
	private StrutsTreeNode root;  */
	
	HttpServletRequest request = ServletActionContext.getRequest();
	
	HttpServletResponse response = ServletActionContext.getResponse();
	
	/*public StrutsTreeNode getRoot() {
		root = bookTypeService.getBaseTypeNode();
		return root;
	}
	@Override
	public String execute() {
		return SUCCESS;
	}*/
	
	@Action(value = "aaa", results = { @Result(name = "success", location = "/views/tree/tree.jsp") })
	public void test(){
		System.out.println(request.getParameter("id") + " " + request.getParameter("name") + " " + request.getParameter("otherParam")); 
		response.setCharacterEncoding("UTF-8"); 
		PrintWriter out = null;
		try {
			out = response.getWriter();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		ZtreeBean zb = new ZtreeBean(0, -1,  "zb", true); 
		ZtreeBean zb1 = new ZtreeBean(1, 0,  "zb1", true); 
		ZtreeBean zb2 = new ZtreeBean(2, 1,  "zb2", false); 
		ZtreeBean zb3 = new ZtreeBean(2, 0,  "zbss", true); 
		List<ZtreeBean> list = new ArrayList<ZtreeBean>(); 
		list.add(zb); 
		list.add(zb1); 
		list.add(zb2); 
		list.add(zb3); 
		String str = JSON.toJSONString(list); 
		out.println(str);
	}
	
	/*public void setBookTypeService(BookTypeService bookTypeService) {
		this.bookTypeService = bookTypeService;
	}

	public void setRoot(StrutsTreeNode root) {
		this.root = root;
	}*/
	
}
