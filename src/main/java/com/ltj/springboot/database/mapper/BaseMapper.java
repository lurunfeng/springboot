package com.ltj.springboot.database.mapper;

public interface BaseMapper<T> {
	int create(T t);

	void delete(int id);

	void update(T t);

	T retrieve(int id);
}
