package com.example.OSSG_INVENTORY.persistance;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.OSSG_INVENTORY.Entity.Hardware;

public interface HardwareRepository extends JpaRepository<Hardware, Integer>{
	
//	@Query("DISTINCT location from Hardware")
	@Query(value = "select DISTINCT location from hardware", nativeQuery = true)
	public List<String> getLocation();
	
	@Query(value = "SELECT hid FROM Hardware ORDER BY hid DESC LIMIT 1", nativeQuery = true)
	public Integer gethardId();
}
