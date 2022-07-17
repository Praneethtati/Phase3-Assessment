package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UsersRepository extends JpaRepository<Users, Integer> {
	@Query("select u from Users u where u.username=?1")
	public Users findByuser(String user);
	@Query("select u from Users u where u.password=?1")
	public Users findBypassword(String password);
	
	
     
}