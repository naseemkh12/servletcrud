package com.student.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.hibernate.util.HibernateUtil;
import com.student.model.Student;

public class StudentDaoImpl implements StudentDao {

	Transaction transaction = null;
	@Override
	public void saveRecords(Student student) {

		

		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			// save the student object
			session.save(student);
			transaction.commit();
		} catch (HibernateException e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
	 @SuppressWarnings("unchecked")
	@Override
	public List<Student> getListRecords() {
		Transaction transaction = null;
		List<Student> listOfUser = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			// save the student object
			listOfUser = session.createQuery("from Student").getResultList();
			transaction.commit();
		} catch (HibernateException e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return listOfUser;
	}
	@Override
	public void delete(int id) {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			//delete student 
			@SuppressWarnings("rawtypes")
			Query query = session.createQuery("delete from  Student where id= "+id+"");
			
			query.executeUpdate();
			transaction.commit();
		} catch (HibernateException e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}	
	}
	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			//delete student 
			//@SuppressWarnings("rawtypes")
			//Query query = session.createQuery("update Student set fname=?, lname=?, en where id= "+student.getId()+"");
			session.saveOrUpdate(student);
			//query.executeUpdate();
			transaction.commit();
		} catch (HibernateException e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}	
	}
	@Override
	public Student findById(int id) {
		// TODO Auto-generated method stub
		
		Transaction transaction = null;
		Student student = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			// save the student object
			student = session.get(Student.class, id);
			transaction.commit();
		} catch (HibernateException e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return student;
	}

}
