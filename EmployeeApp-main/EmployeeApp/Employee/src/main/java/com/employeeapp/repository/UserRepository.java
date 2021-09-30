package com.employeeapp.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.employeeapp.model.User;
import com.employeeapp.model.UserRequest;
import com.employeeapp.service.UserService;
	

 
@Repository
public interface UserRepository
        extends JpaRepository<User, Long> {
	


	@Query(value = "select employeename,age,date_of_birth,user_name,password,dept_name,date_of_joining from \r\n"
			+ "(select b.id as employeeId,dept_name,date_of_joining from department a join employee b on a.id=b.dept_id)a\r\n"
			+ "join \r\n"
			+ "(select employeename,age,date_of_birth,user_name,password,employee_id as employeeId from users)b\r\n"
			+ "on b.employeeId=a.employeeId" ,nativeQuery = true)
	List<Object[]>  queryByUsers();

	
	@Modifying
	@Transactional
	@Query(value 	= "update users set age = :age where name = :name",nativeQuery = true)
	String updateAge(String name, int age);


	

 
}
