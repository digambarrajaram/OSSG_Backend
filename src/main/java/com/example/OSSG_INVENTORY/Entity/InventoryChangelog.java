package com.example.OSSG_INVENTORY.Entity;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "INVENTORYCHANGELOG")
public class InventoryChangelog {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sid")
	private int sid;

	@Column(name = "uniqueid")
	private int uniqueid;

	@Column(name = "remark")
	private String remark;

    
	@Column(name = "mtime")
	private String mtime;
	
	@Column(name = "user")
	private String user;
	

	public String getMtime() {
		return this.mtime;
	}

	public void setMtime(String mtime) {
   
		this.mtime = mtime;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public InventoryChangelog() {
		super();
		// TODO Auto-generated constructor stub
		 LocalDateTime currentDateTime = LocalDateTime.now();
		 ZonedDateTime now = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));

	        // Format the date and time as a string
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy HH:mm:ss");
	        
	        String formattedDateTime = now.format(formatter);
	        this.mtime=formattedDateTime;
	}

	public InventoryChangelog(int sid, int uniqueid, String remark, String mtime, String user) {
		super();
		this.sid = sid;
		this.uniqueid = uniqueid;
		this.remark = remark;
		this.mtime = mtime;
		this.user = user;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public int getUniqueid() {
		return uniqueid;
	}

	public void setUniqueid(int uniqueid) {
		this.uniqueid = uniqueid;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	
		

}
