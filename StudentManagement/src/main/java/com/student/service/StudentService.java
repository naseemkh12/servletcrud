package com.student.service;

import java.util.List;

import com.student.model.Student;

public interface StudentService {

	 void saveRecords(Student student);	
	 
	  List<Student> getListRecords();
		
	  void delete(int id);
	  public void updateStudent(Student student);
	  
		public Student findById(int id);
	
}
