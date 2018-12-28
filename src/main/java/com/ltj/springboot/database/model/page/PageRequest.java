package com.ltj.springboot.database.model.page;

import java.io.Serializable;

public class PageRequest implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8552097327666531629L;
	private int pageNumber = 0;
	private int pageSize = 10;
	/**
	 * mysql偏移量
	 */
	private int offset = 0;
	private String orderBy;

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		if (pageNumber < 0) {
			throw new IllegalArgumentException("当前页码不能为负数");
		}
		this.pageNumber = pageNumber;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		if (pageSize > 100) {
			throw new IllegalArgumentException("页面容量不能大于100条数据");
		}
		this.pageSize = pageSize;
	}

	public int getOffset() {
		offset = (pageNumber > 0) ? (pageSize * (pageNumber - 1)) : 0;
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
