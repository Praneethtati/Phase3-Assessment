package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminDAO {

	@Autowired
	AdminRepository repo;
	
	public Admin insert(Admin a)
	{
		return repo.save(a);
	}

	public List<Admin> retrieve()
	{
		return repo.findAll();
	}
	
	public String deletebyid(int admid)
	{
		repo.deleteById(admid);
		return "Deleted the user with Id "+admid;
	}
	
	public Admin update(Admin a)
	{
		Admin aa=repo.findById(a.getAdmid()).orElse(null);
		
		aa.setAdmname(a.getAdmname());
		aa.setAdmpassword(a.getAdmpassword());
		return repo.save(aa);
	}
}
