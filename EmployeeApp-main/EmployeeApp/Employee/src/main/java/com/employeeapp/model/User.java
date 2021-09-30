package com.employeeapp.model;
import java.util.Date;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.employeeapp.exception.RecordNotFoundException;

@Entity
@Table(name = "users")
public class User {
	
	private static final User RecordNotFoundException = null;

	@Id
	@GeneratedValue
	private Long id; 
	
	@Column(name = "employeename")
	private String name;
	
	
	@Column(name = "age")
	private int age;
	
	@Column(name = "date_of_birth")
	private String dateOfBirth; 
	
	@Column(name = "user_name")
	private String userName;
	
	@Column(name = "password")	
	private String password;
	
	@Column(name = "user_type_id")
	private long userTypeId;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "employee_id", referencedColumnName = "id")
    private Employee employee;
	@Column(name = "is_active")
	private boolean isActive; 
	@Column(name = "created_on")
	private LocalDateTime createdOn; 
	@Column(name = "updated_on")
	private LocalDateTime updatedOn;
	
	public User() {
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

	public long getUserTypeId() {
		return userTypeId;
	}

	public void setUserTypeId(long userTypeId) {
		this.userTypeId = userTypeId;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public LocalDateTime getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}

	public LocalDateTime getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(LocalDateTime updatedOn) {
		this.updatedOn = updatedOn;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", dateOfBirth=" + dateOfBirth + ", userName="
				+ userName + ", password=" + password + ", userTypeId=" + userTypeId + ", employee=" + employee
				+ ", isActive=" + isActive + ", createdOn=" + createdOn + ", updatedOn=" + updatedOn + "]";
	}

	

	

	}

	

