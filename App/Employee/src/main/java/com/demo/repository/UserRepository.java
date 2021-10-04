package com.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.demo.model.User;
import com.demo.model.UserResponse;

 
@Repository
public interface UserRepository
        extends JpaRepository<User, Long> {
	
	@Query(value = "select name,age,date_of_birth,user_name,password,dept_name,date_of_joining from \r\n"
			+ "(select b.id as employeeId,dept_name,date_of_joining from department a join employee b on a.id=b.dept_id)a\r\n"
			+ "join \r\n"
			+ "(select name,age,date_of_birth,user_name,password,employee_id as employeeId from users where is_active=true)b\r\n"
			+ "on b.employeeId=a.employeeId" ,nativeQuery = true)
	List<Object[]>  queryByUsers();
	
	
	@Query(value="select id from users u where u.user_name = :userName",nativeQuery = true)
	Optional<Integer>  getUser(@Param(value = "userName") String userName);
	@Modifying
	@Transactional
	@Query(value="update users u set u.name = :name,u.age = :age,u.date_of_birth = :dob where u.id = :id",nativeQuery = true)
	void updateUser(@Param(value = "name") String name, @Param(value = "age") int age,@Param(value = "dob") String dob,@Param(value = "id") int id);
	@Modifying
	@Transactional
	@Query(value="update employee e set e.date_of_joining = :doj where e.employee_id = :id",nativeQuery = true)
	void updateEmployee(@Param(value = "doj") String doj,@Param(value = "id") int id);
		
	@Modifying
	@Transactional
	@Query(value="update users u set u.is_active = false where u.id = :id",nativeQuery = true)
	void deleteUser(@Param(value = "id") int id);
	
	@Modifying
	@Transactional
	@Query(value="update employee e set e.is_active = false where e.employee_id = :id",nativeQuery = true)
	void deleteEmployee(@Param(value = "id") int id);
 
}
