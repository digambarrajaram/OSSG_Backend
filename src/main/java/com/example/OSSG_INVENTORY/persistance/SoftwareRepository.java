package com.example.OSSG_INVENTORY.persistance;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.OSSG_INVENTORY.Entity.Software;

public interface SoftwareRepository extends JpaRepository<Software, Integer>{
	
	@Query(value = "SELECT sofid FROM software ORDER BY sofid DESC LIMIT 1", nativeQuery = true)
	public Integer getsofId();
	
	@Query("from Software where deleted=?1")
	public List<Software> getAll(boolean falg);
	
	@Modifying
	@Query(value = "update software set deleted=TRUE where sofid=?1", nativeQuery = true)
	public void deletedSoftwareServer(int sofid);
	
	@Modifying
	@Query(value = "update software set downloaduri=?1 where sofid=?2", nativeQuery = true)
	public void adddownloadurl(String filename, String sofid);
	
	@Query(value = "SELECT downloaduri FROM software WHERE sofid=?1", nativeQuery = true)
	public String getdownloaduri(String sofid);

}
