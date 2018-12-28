package com.ltj.springboot.database.service;

public interface BaseService<T> {
	int create(T t);

	void delete(int id);

	void update(T t);

	T retrieve(int id);
}
