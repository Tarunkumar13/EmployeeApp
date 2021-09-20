package com.employeeapp.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeeapp.exception.RecordNotFoundException;
import com.employeeapp.model.Department;
import com.employeeapp.model.Employee;
import com.employeeapp.model.User;
import com.employeeapp.model.UserRequest;
import com.employeeapp.model.UserResponse;
import com.employeeapp.repository.UserRepository;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;



 
@Service
public class UserService {
     
    
    @Autowired
    UserRepository userRepo;
    
     
   
    public  List<UserResponse> getAllUsers()
    {	List<UserResponse> userList=new ArrayList<UserResponse>();
    	List<Object[]> employeeList = userRepo.queryByUsers();
    	for(Object[] obj : employeeList){
    		UserResponse response= new UserResponse();
    		response.setName(obj[0].toString());
    		response.setAge(Integer.parseInt(obj[1].toString()));
    		response.setDateOfBirth(obj[2].toString());
    		response.setUserName(obj[3].toString());
    		response.setDeptName(obj[4].toString());
    		response.setDateOfJoining(obj[5].toString());
    		userList.add(response);
    	     }
         System.out.println("userList"+userList);
    	return userList;
    }
     
  
    
     
     public String createOrUpdateUser(UserRequest entity) throws RecordNotFoundException
    {
    	 User user=new User();
    	 Employee employee=new Employee();
    	 Department deparmenet =new Department();
    	 LocalDateTime now = LocalDateTime.now();
    	 deparmenet.setActive(true);
    	 deparmenet.setDeptName(entity.getDeptName());
    	 deparmenet.setCreatedOn(now);
    	 deparmenet.setUpdatedOn(now);
    	 user.setName(entity.getName());
    	 user.setAge(entity.getAge());
    	 user.setDateOfBirth(entity.getDateOfBirth());
    	 user.setUserName(entity.getUserName());
    	 user.setPassword(entity.getPassword());
    	 user.setUserTypeId(2);
    	 user.setActive(true);
    	 employee.setDateOfJoining(entity.getDateOfJoining());
    	 employee.setActive(true);
    	 employee.setUser(user);
    	 employee.setCreatedOn(now);
    	 employee.setUpdatedOn(now); 
    	 user.setCreatedOn(now);
    	 user.setUpdatedOn(now);
    	 
    	 employee.setDepartment(deparmenet);
    	 user.setEmployee(employee);
    	 userRepo.save(user);
             
            return "Data inserted Successfully";
        
    }
     
   
}