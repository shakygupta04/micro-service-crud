package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.UserRepo;
import com.example.demo.model.User;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserControl {
	
	
	@Autowired
	UserRepo repo;
	
	
	

	 @GetMapping("/users")
	    public List<User> getUsers() {
		 System.out.println("Returned Successfully");
	        return (List<User>) repo.findAll();
	    }
    
	
	@RequestMapping("/users")
    public void addUser(@RequestBody User user) {
		
		System.out.println("Added Successfully");
		repo.save(user);
			
    }
	
	 @DeleteMapping("/deleteuser/{accountno}")
	  public void deleteUser(@PathVariable("accountno") int accountno){
		System.out.println("Deleted Successfully");
		User user=repo.findById(accountno).orElseThrow();
		repo.delete(user);
	 }
	
	 @PutMapping("/updateuser/{accountno}")
	 public void updatebal(@PathVariable("accountno") int accountno,@RequestBody User user) {
		 System.out.println("Amount altered Successfully");
		 User hello=repo.findById(accountno).orElseThrow();
		 hello.setAccountbal(hello.getAccountbal()+user.getAccountbal());
		 repo.save(hello);
	
		 
	 }
	  }
	
