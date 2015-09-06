package com.gxq.book.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ExceptionMapping;
import org.apache.struts2.convention.annotation.ExceptionMappings;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import com.gxq.book.dto.StrutsTreeNode;
import com.gxq.book.service.BookTypeService;
import com.opensymphony.xwork2.ActionSupport;

@ParentPackage(value = "struts-default")
@Namespace("/tree")
@ExceptionMappings({ @ExceptionMapping(exception = "java.lange.RuntimeException", result = "error") })
@Action(value = "dynamicTreeSelect", results = { @Result(name = "success", location = "/views/tree/dynamicTreeSelect.jsp") })
public class DynamicTreeSelectAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	@Autowired
	private BookTypeService bookTypeService;
	private int nodeId;
	private StrutsTreeNode currentNode;
	
	public void setNodeId(int nodeId) {
		this.nodeId = nodeId;
	}
	public int getNodeId() {
		return nodeId;
	}
	
	public String execute() throws Exception {
		//currentNode = bookTypeService.getBookTypeNodeByBaseId();
		currentNode = StrutsTreeNode.getById(nodeId);
		return SUCCESS;
	}
	
	public String getNodeName() {
		return currentNode != null ? currentNode.getName() : "Node not found";
	}
}
