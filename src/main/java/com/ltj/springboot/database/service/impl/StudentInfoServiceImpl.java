package com.ltj.springboot.database.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltj.springboot.database.mapper.StudentInfoMapper;
import com.ltj.springboot.database.model.StudentInfoModel;
import com.ltj.springboot.database.service.StudentInfoService;

@Service
public class StudentInfoServiceImpl implements StudentInfoService {
	@Autowired
	private StudentInfoMapper mapper;

	@Override
	public int create(StudentInfoModel t) {
		mapper.create(t);
		int id = t.getId();
		return id;
	}

	@Override
	public void delete(int id) {
		mapper.delete(id);
	}

	@Override
	public void update(StudentInfoModel t) {
		mapper.update(t);
	}

	@Override
	public StudentInfoModel retrieve(int id) {
		StudentInfoModel model = mapper.retrieve(id);
		return model;
	}

}
