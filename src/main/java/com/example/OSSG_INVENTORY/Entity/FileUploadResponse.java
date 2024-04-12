package com.example.OSSG_INVENTORY.Entity;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

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
	
	@Column(name = "sofid")
	private String sofid;
	
	@Column(name = "user")
	private String user;
	
	@Column(name = "mtime")
	private String mtime;

	public FileUploadResponse() {
		super();
		// TODO Auto-generated constructor stub
		 LocalDateTime currentDateTime = LocalDateTime.now();
		 ZonedDateTime now = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));

       // Format the date and time as a string
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy HH:mm:ss");
       String formattedDateTime = now.format(formatter);
       this.mtime=formattedDateTime;
	}

	public FileUploadResponse(String filename, String downloadUri, long size, String sofid, String user, String mtime) {
		super();
		this.filename = filename;
		this.downloadUri = downloadUri;
		this.size = size;
		this.sofid = sofid;
		this.user = user;
		this.mtime=mtime;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getMtime() {
		return mtime;
	}

	public void setMtime(String mtime) {
		this.mtime = mtime;
	}

	public String getSofid() {
		return sofid;
	}

	public void setSofid(String sofid) {
		this.sofid = sofid;
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
