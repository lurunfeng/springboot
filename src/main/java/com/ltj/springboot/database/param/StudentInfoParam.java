package com.ltj.springboot.database.param;

public class StudentInfoParam extends BaseParam {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6539319669251835092L;
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
}
