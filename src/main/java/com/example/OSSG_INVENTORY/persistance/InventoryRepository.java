package com.example.OSSG_INVENTORY.persistance;

import java.util.List;

import org.springframework.data.jpa.repository.*;


import com.example.OSSG_INVENTORY.Entity.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Integer> 
{
//	String s1="SELECT i.*,(SELECT p.project_name FROM projects p WHERE p.pid = i.pid) AS project_name FROM inventory i;";
//	@Query(s1)
//	public List<Inventory> getAllServers();
	
//	 @Query(value = "SELECT i.*,(SELECT p.project_name FROM projects p WHERE p.pid = i.pid) AS project_name FROM inventory i", nativeQuery = true)
	 
//	 @Query(value = "select inventory.*,(select projects.project_name from projects where projects.pid = inventory.pid) as pname from inventory;", nativeQuery = true)
//	 public List<Inventory> getAllServers();
	
	@Query(value = "SELECT sid FROM inventory ORDER BY sid DESC LIMIT 1", nativeQuery = true)
	public Integer getId();
	
	@Query("from Inventory where deleted=?1")
	public List<Inventory> getAll(boolean falg);
	
	//@Query(value = "update Inventory set d='true' where sid", nativeQuery = true)
	
	@Modifying
	@Query(value = "update inventory set deleted=TRUE where sid=?1", nativeQuery = true)
	public void deletedServer(int sid);
	

}
