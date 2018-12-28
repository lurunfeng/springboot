package com.ltj.springboot.database.model;

import com.alibaba.fastjson.JSON;

public class StudentInfoModel extends BaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4713357754034654939L;
	private String name;
	private String studentId;
	private String classInfo;
	private String desc;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getClassInfo() {
		return classInfo;
	}

	public void setClassInfo(String classInfo) {
		this.classInfo = classInfo;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return JSON.toJSONString(this);
	}
}
