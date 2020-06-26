package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.UserRepo;
import com.example.demo.model.User;


@Controller
public class UserControl {
	
	
	@Autowired
	UserRepo repo;
	
	@RequestMapping("/")
	public String home() {
		
		return "home.jsp";
		
	}
	
	@RequestMapping("/addUser")
    public String addUser(User user) {
		repo.save(user);
		return "home.jsp";
    	
    	
    }
}
