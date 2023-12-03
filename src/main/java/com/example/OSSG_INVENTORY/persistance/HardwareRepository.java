package com.example.OSSG_INVENTORY.persistance;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.OSSG_INVENTORY.Entity.Hardware;
import com.example.OSSG_INVENTORY.Entity.Inventory;

public interface HardwareRepository extends JpaRepository<Hardware, Integer>{
	
//	@Query("DISTINCT location from Hardware")
	@Query(value = "select DISTINCT location from hardware", nativeQuery = true)
	public List<String> getLocation();
	
	@Query(value = "SELECT hid FROM Hardware ORDER BY hid DESC LIMIT 1", nativeQuery = true)
	public Integer gethardId();
	
	@Query("from Hardware where deleted=?1")
	public List<Hardware> getAll(boolean falg);
	
	@Modifying
	@Query(value = "update Hardware set deleted=TRUE where hid=?1", nativeQuery = true)
	public void deletedHardwareServer(int hid);
}
