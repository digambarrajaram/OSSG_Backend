package com.example.OSSG_INVENTORY.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "files")
public class FileUploadResponse {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "fid")
	private int fid;
	
	@Column(name = "filename")
	private String filename;
	
	@Column(name = "downloaduri")
	private String downloadUri;
	
	@Column(name = "size")
	private long size;

	public FileUploadResponse(String filename, String downloadUri, long size) {
		super();
		this.filename = filename;
		this.downloadUri = downloadUri;
		this.size = size;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getDownloadUri() {
		return downloadUri;
	}

	public void setDownloadUri(String downloadUri) {
		this.downloadUri = downloadUri;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}

}
