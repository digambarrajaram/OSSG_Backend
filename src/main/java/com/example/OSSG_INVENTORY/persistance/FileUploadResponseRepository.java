package com.example.OSSG_INVENTORY.persistance;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.OSSG_INVENTORY.Entity.FileUploadResponse;

public interface FileUploadResponseRepository extends JpaRepository<FileUploadResponse, Integer>{

}
