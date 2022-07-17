package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class RunningShoesPOJO {
	@Id
	private int shoeid;
	private String shoename;
	private String shoesize;
	private String shoeprice;
	

}
