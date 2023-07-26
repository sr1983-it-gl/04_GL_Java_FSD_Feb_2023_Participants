package com.greatlearning.sra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.greatlearning.sra.entity.User;

public interface UserRepository 
	extends JpaRepository<User, Integer>{

	@Query("SELECT u from User u where u.username = ?1")	
	User fetchUserBasedOnUsername(String username);
}
