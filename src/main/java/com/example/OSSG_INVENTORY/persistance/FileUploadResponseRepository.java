package com.example.OSSG_INVENTORY.persistance;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.OSSG_INVENTORY.Entity.FileUploadResponse;

public interface FileUploadResponseRepository extends JpaRepository<FileUploadResponse, Integer>{

//	List<FileUploadResponse> getAll();
	
	@Query(value = "SELECT * FROM files WHERE sofid=?1", nativeQuery = true)
	public List<FileUploadResponse> getdownloadinfo(String sofid);
	
//	@Query(value = "SELECT * FROM files", nativeQuery = true)
//	public List<FileUploadResponse> getdownloadinfo();
	
	
}
