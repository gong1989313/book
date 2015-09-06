package com.gxq.book.bak;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ExceptionMapping;
import org.apache.struts2.convention.annotation.ExceptionMappings;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.gxq.book.dto.UserInfo;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * Struts2基于注解的Action配置
 * 
 * ParentPackage 继承父包 Namespace命名空间 Results跳转页面 Action访问方法
 */

@ParentPackage(value = "json-default")
@Namespace("/views/json")
@Results( {
    @Result(name = "message" , type="json"),
    @Result(name = "userInfo",  type="json"),
    @Result(name = "list", type="json"),
    @Result(name = "map", type="json"),
    @Result(name = "fail", location = "/views/json/index.jsp", type="json")
})
@ExceptionMappings({ @ExceptionMapping(exception = "java.lange.RuntimeException", result = "error") })
public class JsonAction extends ActionSupport {
	
	private String message;     //使用json返回单个值  
    private UserInfo userInfo;      //使用json返回对象  
    private List<UserInfo> userInfosList;     //使用josn返回List对象  
    private Map<String,UserInfo> userInfosMap;    //使用json返回Map对象 
	
	private static final long serialVersionUID = 1L;

	/** 
     * <p> 
     *  返回单个值 
     * <p> 
     * @return 
     */  
	@Action(value = "message") 
    public String returnMessage(){  
        this.message = "成功返回单个值:杨金德";  
        return "message";  
    }  
    /** 
     * <p> 
     *  返回UserInfo对象 
     * </p> 
     * @return 
     */  
	@Action(value = "userInfo") 
    public String returnUserInfo(){  
        userInfo = new UserInfo();  
        userInfo.setUserId(10000);  
        userInfo.setUserName("柳梦璃");  
        userInfo.setPassword("liumengli");  
        return "userInfo";  
    }  
    /** 
     * <p> 
     *  返回List对象 
     * </p> 
     * @return 
     */  
	@Action(value = "list")
    public String returnList(){  
        userInfosList = new ArrayList<UserInfo>();  
        UserInfo u1 = new UserInfo();  
        u1.setUserId(10000);  
        u1.setUserName("柳梦璃");  
        u1.setPassword("liumengli");  
        UserInfo u2 = new UserInfo();  
        u2.setUserId(10001);  
        u2.setUserName("韩菱纱");  
        u2.setPassword("hanlingsha");  
        UserInfo u3 = new UserInfo();  
        u3.setUserId(10002);  
        u3.setUserName("云天河");  
        u3.setPassword("yuntianhe");  
        UserInfo u4 = new UserInfo();  
        u4.setUserId(10003);  
        u4.setUserName("玄霄");  
        u4.setPassword("xuanxiao");  
        userInfosList.add(u1);  
        userInfosList.add(u2);  
        userInfosList.add(u3);  
        userInfosList.add(u4);  
        return "list";  
    }  
    /** 
     * <p> 
     *  返回Map对象 
     * </p> 
     * @return 
     */  
	@Action(value = "map")
    public String returnMap(){  
        userInfosMap = new HashMap<String,UserInfo>();  
        UserInfo u1 = new UserInfo();  
        u1.setUserId(10000);  
        u1.setUserName("林月如");  
        u1.setPassword("linyueru");  
        UserInfo u2 = new UserInfo();  
        u2.setUserId(10001);  
        u2.setUserName("赵灵儿");  
        u2.setPassword("zhaolinger");  
        UserInfo u3 = new UserInfo();  
        u3.setUserId(10002);  
        u3.setUserName("李逍遥");  
        u3.setPassword("lixiaoyao");  
        UserInfo u4 = new UserInfo();  
        u4.setUserId(10003);  
        u4.setUserName("女娲");  
        u4.setPassword("nvwa");  
        userInfosMap.put(u1.getUserId()+"", u1);  
        userInfosMap.put(u2.getUserId()+"", u2);  
        userInfosMap.put(u3.getUserId()+"", u3);  
        userInfosMap.put(u4.getUserId()+"", u4);  
        return "map";  
    }  
    /** 
     * <p> 
     *  获得对象，也就是通过表达获得对象(异步的) 
     * </P> 
     * @return 
     */  
	@Action(value = "test", results = { @Result(name = "success", type = "json") }) 
    public String gainUserInfo(){  
        System.out.println("用户ID："+userInfo.getUserId());  
        System.out.println("用户名："+userInfo.getUserName());  
        System.out.println("密码："+userInfo.getPassword());  
        return "userInfo";  
    }  
	
	
	public String getMessage() {  
        return message;  
    }  
    public void setMessage(String message) {  
        this.message = message;  
    }  
    public UserInfo getUserInfo() {  
        return userInfo;  
    }  
    public void setUserInfo(UserInfo userInfo) {  
        this.userInfo = userInfo;  
    }  
    public List<UserInfo> getUserInfosList() {  
        return userInfosList;  
    }  
    public void setUserInfosList(List<UserInfo> userInfosList) {  
        this.userInfosList = userInfosList;  
    }  
    public Map<String, UserInfo> getUserInfosMap() {  
        return userInfosMap;  
    }  
    public void setUserInfosMap(Map<String, UserInfo> userInfosMap) {  
        this.userInfosMap = userInfosMap;  
    }  
}
