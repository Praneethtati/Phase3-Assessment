package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;


@Data
@Entity
public class Mountaineering {
	
	@Id
	private int mshoeid;
	private String mshoename;
	private String mshoesize;
	private String mshoeprice;

}