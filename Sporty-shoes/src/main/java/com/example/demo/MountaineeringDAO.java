package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MountaineeringDAO {
	@Autowired
	MountaineeringRepository repo;
	
	public Mountaineering insert(Mountaineering m)
	{
	  return repo.save(m);
	}
	
	public List<Mountaineering> display()
	{
		return repo.findAll();
	}
	
	public String deletebyId(int mshoeid)
	{
		repo.deleteById(mshoeid);
		
		return "deleted the ID "+mshoeid;
	}
	
	public Mountaineering update(Mountaineering m)
	{
		Mountaineering mm=repo.findById(m.getMshoeid()).orElse(null);
		
		mm.setMshoeid(m.getMshoeid());
		mm.setMshoename(m.getMshoename());
		mm.setMshoesize(m.getMshoesize());
		mm.setMshoeprice(m.getMshoeprice());
		return repo.save(mm);
	}

}