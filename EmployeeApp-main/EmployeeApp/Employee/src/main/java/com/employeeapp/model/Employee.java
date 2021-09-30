package com.employeeapp.model;


import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
	@GeneratedValue
	private Long id; 
	
	@Column(name = "date_of_joining")
	private String dateOfJoining;

	@Column(name = "is_active")
	private boolean isActive; 
	@Column(name = "created_on")
	private LocalDateTime createdOn; 
	@Column(name = "updated_on")
	private LocalDateTime updatedOn;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "employee_id", referencedColumnName = "id")
    private User user;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dept_id", referencedColumnName = "id")
    private Department department;


	
	
	public Employee() {
	}

	

	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getDateOfJoining() {
		return dateOfJoining;
	}



	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
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



	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}



	public Department getDepartment() {
		return department;
	}



	public void setDepartment(Department department) {
		this.department = department;
	}
	


	@Override
	public String toString() {
		return "Employee [id=" + id + ", date_of_joining=" + dateOfJoining + ", isActive=" + isActive + ", createdOn="
				+ createdOn + ", updatedOn=" + updatedOn + ", user=" + user + ", department=" + department + "]";
	}



	
	
	
	

}
