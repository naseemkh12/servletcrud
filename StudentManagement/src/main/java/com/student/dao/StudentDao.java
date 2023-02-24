package com.student.dao;

import java.util.List;

import com.student.model.Student;

public interface StudentDao {

	void saveRecords(Student student);
	
	List<Student>getListRecords();
	
	void delete(int id);

	void updateStudent(Student student);
	
	Student findById(int id);
	
}
