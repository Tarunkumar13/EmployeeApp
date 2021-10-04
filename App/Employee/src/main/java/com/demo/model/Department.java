package com.demo.model;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table	(name = "department")
public class Department {
	@Id
	@GeneratedValue
	private long id;
	
	
	@Column(name= "dept_name")
	private String deptName; 
	
	@Column(name = "is_active")
	private boolean isActive; 
	@Column(name = "created_on")
	private LocalDateTime createdOn; 
	@Column(name = "updated_on")
	private LocalDateTime updatedOn;
	
	@OneToMany(mappedBy = "department", cascade = CascadeType.ALL)

    private Set<Employee> employees = new HashSet<Employee>(0);
	
	public Department() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
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

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", deptName=" + deptName + ", isActive=" + isActive + ", createdOn=" + createdOn
				+ ", updatedOn=" + updatedOn + ", employees=" + employees + "]";
	}

	

	
	
	
	
	
	
	

}
