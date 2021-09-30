package com.employeeapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeeapp.exception.RecordNotFoundException;
import com.employeeapp.model.User;
import com.employeeapp.model.UserRequest;
import com.employeeapp.model.UserResponse;
import com.employeeapp.repository.UserRepository;
import com.employeeapp.service.UserService;

 
@RestController
@RequestMapping("/users")
public class UserController
{
  
	private static final String name = null;
	@Autowired
    UserService service;
	
	@Autowired
	UserRepository repository;
    
    @GetMapping
    public  List<UserResponse> getAllUsers() {
    	List<UserResponse> list = service.getAllUsers();
 
        return list;
    }
    
      @PostMapping
      public String createOrUpdateUser(@Validated @RequestBody UserRequest user)
                                                      throws RecordNotFoundException {
      	  System.out.println("entity"+user.getDeptName());
      	  String message = service.createOrUpdateUser(user);
          return message; 
      }
      @PutMapping("/users/{name}")
      public String updateUser(@RequestBody UserRequest user, @PathVariable("name") String name, int age) 
    		  throws RecordNotFoundException
      {
    	 
    	  String message = service.updateAge(name , age);
          return message; 
      }
     


      @DeleteMapping("/users/{name}")
      public Object deleteUser(@Validated @RequestBody UserRequest user)
                                                      throws RecordNotFoundException {
    	  
          return null; 
      }
  }


 
      	  

      
      
 
