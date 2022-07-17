package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GymShoesDAO {
	@Autowired
	GymShoesRepository repo;
	public GymShoesPOJO insert(GymShoesPOJO g) {
		return repo.save(g);
	}
	
	
	//retrieve all the objects
	public List<GymShoesPOJO> getall(){
		return repo.findAll();
	}
	
	
	//delete
		public String deleteByid(int Gshoeid) {
			repo.deleteById(Gshoeid);
			return "deleted the id value:"+Gshoeid; 
		}

	
	
	public GymShoesPOJO update(GymShoesPOJO g) {
		GymShoesPOJO gg=repo.findById(g.getGshoeid()).orElse(null);
			
		gg.setGshoename(g.getGshoename());
		gg.setGshoesize(g.getGshoesize());
		gg.setGshoeprice(g.getGshoeprice());
		return repo.save(gg);
	}
	
}


