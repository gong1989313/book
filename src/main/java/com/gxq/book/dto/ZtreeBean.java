package com.gxq.book.dto;

import java.io.Serializable;

public class ZtreeBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
    private int pId;
    private String name;
    private boolean open;

    public ZtreeBean() {
    }

    public ZtreeBean(int id, int pId, String name, boolean open) {
        super();
        this.id = id;
        this.name = name;
        this.pId = pId;
        this.open = open;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

}
