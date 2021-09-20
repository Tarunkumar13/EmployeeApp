package com.employeeapp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.employeeapp.model.User;
import com.employeeapp.model.UserResponse;

 
@Repository
public interface UserRepository
        extends JpaRepository<User, Long> {
	
	@Query(value = "select employeename,age,date_of_birth,user_name,dept_name,date_of_joining from \r\n"
			+ "(select b.id as employeeId,dept_name,date_of_joining from department a join employee b on a.id=b.dept_id)a\r\n"
			+ "join \r\n"
			+ "(select employeename,age,date_of_birth,user_name,employee_id as employeeId from users)b\r\n"
			+ "on b.employeeId=a.employeeId" ,nativeQuery = true)
	List<Object[]>  queryByUsers();
	
 
}
