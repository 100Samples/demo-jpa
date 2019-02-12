package com.kanodia.learning.jpa.demojpa.controller;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kanodia.learning.jpa.demojpa.entity.User;

@RestController
public class UserController {
	
	@Autowired
	CrudRepository<User, Integer> userRepsitory;
	
	@GetMapping("/users")
	List<User> getAllUsers()
	{
		List<User> usersList = new ArrayList<User>();
		Iterable<User> iterable= userRepsitory.findAll();
		iterable.forEach(usersList::add);
		return usersList;
	}
	
	
	@RequestMapping(path="/user/add",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE,
			consumes=MediaType.APPLICATION_JSON_VALUE)
	String addUser(@RequestBody User userRequest)
	{
		
		userRepsitory.save(userRequest);
		return "Added Successfully";
	}
	
	@GetMapping("/dummydata")
	List<User> populateUser()
	{
		if(userRepsitory.count()!=0)
			return getAllUsers();
		else {
		User user1 = new User("Saurabh","Kanodia");
		userRepsitory.save(user1);
		List<User> usersList = new ArrayList<User>();
		userRepsitory.findAll().forEach(usersList::add);
		return usersList; }
	}
	
}
