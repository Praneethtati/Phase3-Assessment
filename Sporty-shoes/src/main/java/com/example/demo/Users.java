package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Users {
	@Id
	
	private int userid;
	private String username;
	private String password;
	
	
	
}
