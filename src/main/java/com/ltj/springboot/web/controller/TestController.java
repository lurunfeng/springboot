package com.ltj.springboot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ltj.springboot.common.model.RestResult;
import com.ltj.springboot.database.model.StudentInfoModel;
import com.ltj.springboot.database.service.impl.StudentInfoServiceImpl;
import com.ltj.springboot.web.model.Person;

import io.swagger.annotations.Api;

@RestController
@RequestMapping(value = "/api/springboot/web", produces = "application/json", method = RequestMethod.GET)
@Api(description = "用户管理")
public class TestController {
	@Autowired
	private StudentInfoServiceImpl studentInfoServiceImpl;

	@RequestMapping(value = "/test", produces = "application/json", method = RequestMethod.GET)
	public Person testConmtroller() {
		Person person = new Person(10, "yyyy");
		return person;

	}

	@RequestMapping(value = "/create", produces = "application/json", method = RequestMethod.GET)
	public RestResult<Integer> create() {
		RestResult<Integer> res = new RestResult<>();
		StudentInfoModel studentInfoModel = new StudentInfoModel();
		studentInfoModel.setClassInfo("五年三班");
		studentInfoModel.setName("刘团结");
		studentInfoModel.setStudentId("l00417809");
		int id = studentInfoServiceImpl.create(studentInfoModel);
		res.setData(id);
		return res;

	}

}
