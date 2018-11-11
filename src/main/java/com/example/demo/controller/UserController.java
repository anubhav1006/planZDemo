package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Address;
import com.example.demo.model.Users;
import com.example.demo.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/create" ,  method = RequestMethod.POST)
	public Users create(@RequestBody Users user) {
		
		return userService.createUser(user);
	}
	
	@RequestMapping("/get/{id}")
	public Optional<Users> getUser(@PathVariable int id) {
		return userService.getById(id);
	}
	@RequestMapping("/getAll")
	public List<Users> getAll(){
		return userService.getAll();
	}
	@RequestMapping("/update/{id}")
	public Users update(@RequestBody Users user) {
		Users u = userService.updateUser(user);
		return u;
	}
	@RequestMapping("/delete")
	public String delete(@PathVariable int id) {
		userService.deleteUser(id);
		return "Deleted "+id;
	}

}
