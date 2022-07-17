package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrekkingDAO {
	@Autowired
	TrekkingRepository repo;
	public Trekking insert(Trekking t) {
		return repo.save(t);
	}
	
	
	//retrieve all the objects
	public List<Trekking> display(){
		return repo.findAll();
	}
	
	
	//delete
		public String deleteByid(int tshoeid) {
			repo.deleteById(tshoeid);
			return "deleted the id value:"+tshoeid; 
		}

	
	
	public Trekking update(Trekking t) {
		Trekking tt=repo.findById(t.getTshoeid()).orElse(null);
			
		tt.setTshoename(t.getTshoename());
		tt.setTshoesize(t.getTshoeprice());
		tt.setTshoeprice(t.getTshoeprice());
		return repo.save(tt);
	}
	
}
