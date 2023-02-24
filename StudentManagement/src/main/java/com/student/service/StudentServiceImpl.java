package com.student.service;

import java.util.ArrayList;
import java.util.List;

import com.student.dao.StudentDao;
import com.student.dao.StudentDaoImpl;
import com.student.model.Student;

public class StudentServiceImpl implements StudentService {

	StudentDao studentDao=new StudentDaoImpl();
	@Override
	public void saveRecords(Student student) {
		// TODO Auto-generated method stub
		studentDao.saveRecords(student);
		
	}
	@Override
	public List<Student>getListRecords() {
		// TODO Auto-generated method stub
		return studentDao.getListRecords();
	}
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		studentDao.delete(id);
	}
	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		studentDao.updateStudent(student);
	}
	@Override
	public Student findById(int id) {
		// TODO Auto-generated method stub
		return studentDao.findById(id);
	}
	
	

}
