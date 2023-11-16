package com.example.OSSG_INVENTORY.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.OSSG_INVENTORY.Entity.Users;

public interface UserRepository extends JpaRepository<Users, Integer>{
	
	@Query("from Users where username=?1")
	public Users getByUsername(String username);
}
