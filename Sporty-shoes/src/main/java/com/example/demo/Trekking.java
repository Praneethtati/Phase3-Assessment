package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;


@Data
@Entity
public class Trekking {
	
	@Id
	private int tshoeid;
	private String tshoename;
	private String tshoesize;
	private String tshoeprice;

}
