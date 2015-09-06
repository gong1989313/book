package com.gxq.book.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StrutsTreeNode implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private String code;
	private List<StrutsTreeNode> children;
	private static Map<String, StrutsTreeNode> nodeMap = new HashMap<String, StrutsTreeNode>();
/*	static {
        new StrutsTreeNode(1, "省总公司",
                new StrutsTreeNode(2, "地市1分公司",
                        new StrutsTreeNode(3, "桥东区办事处",
                                new StrutsTreeNode(4, "市场组"),
                                new StrutsTreeNode(7, "客服组"),
                                new StrutsTreeNode(8, "技术组")),
                        new StrutsTreeNode(9, "开发区办事处",
                                new StrutsTreeNode(10, "市场组"),
                                new StrutsTreeNode(11, "客服组"),
                                new StrutsTreeNode(12, "技术组"),
                                new StrutsTreeNode(13, "后勤组"))),
                new StrutsTreeNode(14, "地市2分公司",
                        new StrutsTreeNode(15, "软件开发组"),
                        new StrutsTreeNode(16, "软件测试组"),
                        new StrutsTreeNode(17, "售后服务组"),
                        new StrutsTreeNode(18, "市场拓展组"),
                        new StrutsTreeNode(19, "财物组")));
    }*/
	public static StrutsTreeNode getById(Integer id) {
		return nodeMap.get(Integer.toString(id));
	}
	
	public StrutsTreeNode(int id, String name, String code, StrutsTreeNode...children) {
		setId(Integer.toString(id));
		setName(name);
		setCode(code);
		this.children=new ArrayList<StrutsTreeNode>();
		for(StrutsTreeNode child:children){
			this.children.add(child);
		}
		nodeMap.put(Integer.toString(id), this);
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<StrutsTreeNode> getChildren() {
		return this.children;
	}
	public boolean addChildren(StrutsTreeNode node) {
		return children.add(node);
	}
	public void setChildren(List<StrutsTreeNode> children) {
		this.children = children;
	}

	@Override
	public String toString() {
		return "StrutsTreeNode [id=" + id + ", name=" + name + ", code=" + code + ", children=" + children + "]";
	}
}