package com.util.packages;

import java.util.List;

import studentManagement.been.StudentManagementbeen;

public interface DaoInterface {
	public void insert(StudentManagementbeen b);
	public  List<StudentManagementbeen> list();
	public  StudentManagementbeen getEmployeeById(int id);
	


    public  int delete(int id);
	int update(StudentManagementbeen b);

}
