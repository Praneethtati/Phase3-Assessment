package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersDAO {
	@Autowired
	UsersRepository repo;
	
	public Users findbyuser(String user)
	{
		return repo.findByuser(user);
	}
	
	
	public Users findbypassword(String password)
	{
		return repo.findBypassword(password);
	}
	
	public Users insert(Users u)
	{
		return repo.save(u);
	}
	
	public List<Users> getall()
	{
		return repo.findAll();
	}
	
	public String deletebyid(int userid)
	{
		repo.deleteById(userid);
		return "Deleted the user with Id "+userid;
	}
	
	public Users update(Users u)
	{
		Users uu=repo.findById(u.getUserid()).orElse(null);
		
		uu.setUsername(u.getUsername());
		uu.setPassword(u.getPassword());
		return repo.save(uu);
	}
	
	
	

}
