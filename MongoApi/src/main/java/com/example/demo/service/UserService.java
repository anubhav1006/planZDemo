package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Address;
import com.example.demo.model.Users;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	//create a user
	public Users createUser(Users user)
	{
		return userRepository.save(user);
	}
	
	//retrive all users
	public List<Users> getAll()
	{
		return userRepository.findAll();
		
	}
	
	//retrive a user
	public Optional<Users> getById(int id)
	{
		return userRepository.findById(id);
	}
	
	//update a user
	public Users updateUser(Users user)
	{
		Optional<Users> u = userRepository.findById(user.getId());
		if(u.isPresent())
		{
			u.get().setName(user.getName());
			u.get().setAge(user.getAge());
			u.get().setAddress(user.getAddress());
		}
		return userRepository.save(u.get());
	}
	
	//delete a user
	public void deleteUser(int id)
	{
		Optional<Users> user = userRepository.findById(id);
		if(user.isPresent())
		{
			userRepository.delete(user.get());
		}
		
	}
	
	
	
	
	
	
	
	
	
	
}
