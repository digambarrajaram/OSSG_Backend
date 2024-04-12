package com.example.OSSG_INVENTORY.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.OSSG_INVENTORY.Entity.FileUploadResponse;

public interface FileUploadResponseRepository extends JpaRepository<FileUploadResponse, Integer>{
	
//	@Query(value = "SELECT downloaduri FROM files WHERE sofid=?1", nativeQuery = true)
//	public String getdownloaduri(String sofid);
}
