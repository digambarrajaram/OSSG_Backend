package com.example.OSSG_INVENTORY.Entity;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

import org.hibernate.annotations.CreationTimestamp;

//import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "hardwarechangelog")
public class HardwareChangelog {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "uniqueid")
	private int uniqueid;

	@Column(name = "remark")
	private String remark;

	@Column(name = "mtime")
	private String mtime;

	@Column(name = "user")
	private String user;

	public HardwareChangelog() {
		super();
		// TODO Auto-generated constructor stub
		 LocalDateTime currentDateTime = LocalDateTime.now();
		 ZonedDateTime now = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));

        // Format the date and time as a string
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        this.mtime=formattedDateTime;
	}

	public HardwareChangelog(int id, int uniqueid, String remark, String mtime, String user, String ip) {
		super();
		this.id = id;
		this.uniqueid = uniqueid;
		this.remark = remark;
		this.mtime = mtime;
		this.user = user;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getMtime() {
		return mtime;
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

	

	
}
