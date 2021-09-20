package com.employeeapp.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class UserResponse {
	private String name;
	private int age; 
	private String dateOfBirth;
	private String userName;
	private String dateOfJoining;
	private String deptName;
	
	public UserResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public UserResponse(String name, int age, String dateOfBirth, String userName, String dateOfJoining,
			String deptName) {
		super();
		this.name = name;
		this.age = age;
		this.dateOfBirth = dateOfBirth;
		this.userName = userName;
		this.dateOfJoining = dateOfJoining;
		this.deptName = deptName;
	}
	
	
	
}
