package com.ltj.springboot.database.param;

import java.io.Serializable;
import java.sql.Date;

public class BaseParam implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5147850966092536887L;
	// 主键ID
	private int id;
	// 创建时间
	private Date gmtCreate;
	// 修改时间
	private Date gmtModify;

	private int pageNum;

	private int pageSize;
	private String ordeyBy;
	private int offset;

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

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public String getOrdeyBy() {
		return ordeyBy;
	}

	public void setOrdeyBy(String ordeyBy) {
		this.ordeyBy = ordeyBy;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}
}
