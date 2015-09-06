package com.gxq.book.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ExceptionMapping;
import org.apache.struts2.convention.annotation.ExceptionMappings;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;  

/** 
 * 使用注解来配置Action 
 *  
 */  
@ParentPackage("struts-default")  
// 父包  
@Namespace("/user")  
@Results( { @Result(name = "success", location = "/bak/main.jsp"),  
        @Result(name = "error", location = "/bak/error.jsp") })  
@ExceptionMappings( { @ExceptionMapping(exception = "java.lange.RuntimeException", result = "error") })  
public class LoginAction extends ActionSupport {  
    private static final long serialVersionUID = -2554018432709689579L;  
    private String loginname;  
    private String pwd;  
  
    @Action(value = "login")  
    public String login() throws Exception {  
    	System.out.println("hello,world.................................................");
        if ("qq".equals(loginname) && "123".equals(pwd)) {  
            return SUCCESS;  
        } else {  
            return ERROR;  
        }  
    }  
  
    @Action(value = "add", results = { @Result(name = "success", location = "/bak/index.jsp") })  
    public String add() throws Exception {  
    	 // Map<String, Object> sessionMap = ActionContext.getContext().getSession();
        return SUCCESS;  
    }  
  
    public String getLoginname() {  
        return loginname;  
    }  
  
    public void setLoginname(String loginname) {  
        this.loginname = loginname;  
    }  
  
    public String getPwd() {  
        return pwd;  
    }  
  
    public void setPwd(String pwd) {  
        this.pwd = pwd;  
    }  
  
}