package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class GymShoesPOJO {
	@Id
	private int Gshoeid;
	private String Gshoename;
	private String Gshoesize;
	private String Gshoeprice;
	

}
