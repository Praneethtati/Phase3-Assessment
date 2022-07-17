package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Admin {
	
    @Id
	private int admid;
	private String admname;
	private String admpassword;

}
