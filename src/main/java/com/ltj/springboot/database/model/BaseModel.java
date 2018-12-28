package com.ltj.springboot.database.model;

import java.io.Serializable;
import java.sql.Date;

public class BaseModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5640350853553202122L;
	// 主键ID
	private int id;
	// 创建时间
	private Date gmtCreate;
	// 修改时间
	private Date gmtModify;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModify() {
		return gmtModify;
	}

	public void setGmtModify(Date gmtModify) {
		this.gmtModify = gmtModify;
	}
}
