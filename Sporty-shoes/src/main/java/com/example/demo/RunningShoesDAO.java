package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RunningShoesDAO {
	@Autowired
	RunningShoesRepository repo;
	
	public RunningShoesPOJO insert(RunningShoesPOJO ru)
	{
	  return repo.save(ru);
	}
	
	public List<RunningShoesPOJO> display()
	{
		return repo.findAll();
	}
	
	public String deleteById(int shoeid)
	{
		repo.deleteById(shoeid);
		return "deleted the ID "+shoeid;
	}
	
	public RunningShoesPOJO update(RunningShoesPOJO ru)
	{
		RunningShoesPOJO ruup=repo.findById(ru.getShoeid()).orElse(null);
		
		ruup.setShoename(ru.getShoename());
		ruup.setShoesize(ru.getShoesize());
		ruup.setShoeprice(ru.getShoeprice());
		return repo.save(ruup);
		
	}
   
	public RunningShoesPOJO findbyid(Integer shoeid) {
		RunningShoesPOJO rs = repo.findById(shoeid).orElse(null);
		return rs;
	}
}
