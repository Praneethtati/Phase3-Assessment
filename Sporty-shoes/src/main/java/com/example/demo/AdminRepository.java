package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
	@Query("select a from Admin a where a.admname=?1")
	public Admin findByAdmname(String admna);
    
	@Query("select a from Admin a where a.admpassword=?1")
	public Admin findByAdmpassword(String admpa);

	

}
