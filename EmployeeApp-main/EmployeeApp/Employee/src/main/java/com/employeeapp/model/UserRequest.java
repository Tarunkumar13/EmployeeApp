package com.employeeapp.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


public class UserRequest {
	private Long id;
	private String name;
	
	@NotNull
	@Min(18)
	private int age;
	
	
	private String dateOfBirth;
	
	@NotNull
	@Size(min = 10, max =10)
	private String userName;
	
	@NotNull
	@Pattern(regexp = "^[a-zA-Z0-9]*$")
	private String password;
	
	
	private String dateOfJoining;
	
	private String deptName;
	
	
	

	public UserRequest() {
	
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public UserRequest(Long id, String name, int age, String dateOfBirth, String userName, String password, String dateOfJoining,
			String deptName) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.dateOfBirth = dateOfBirth;
		this.userName = userName;
		this.password = password;
		this.dateOfJoining = dateOfJoining;
		this.deptName = deptName;
	}
	
	
	
}
