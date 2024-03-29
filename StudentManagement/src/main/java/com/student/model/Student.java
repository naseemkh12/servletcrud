package com.student.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "StudentDemo")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)      
	private int id;
  private String firstName;
  private String lastName;
  private String email;
  private String address;
  
public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Student(int id, String firstName, String lastName, String email, String address) {
	super();
	this.id=id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.address = address;
}
public Student() {
	super();
}

@Override
public String toString() {
	return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
			+ ", address=" + address + "]";
}

  
}
