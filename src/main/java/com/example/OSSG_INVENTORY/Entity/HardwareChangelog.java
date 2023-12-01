package com.example.OSSG_INVENTORY.Entity;

import java.util.*;

import org.hibernate.annotations.CreationTimestamp;

//import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "hardwarechangelog")
public class HardwareChangelog {

	public HardwareChangelog(int hid, String assetno, Date creationTimestamp) {
		super();
		this.hid = hid;
		this.assetno = assetno;
		this.creationTimestamp = creationTimestamp;
	}
	public HardwareChangelog(String assetno) {
		super();
		this.assetno = assetno;
		 this.creationTimestamp = new Date();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "hid")
	private int hid;

	@Column(name = "assetno")
	private String assetno;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "mtime")
	private Date creationTimestamp;

	public int getHid() {
		return hid;
	}

	public void setHid(int hid) {
		this.hid = hid;
	}

	public String getAssetno() {
		return assetno;
	}

	public void setAssetno(String assetno) {
		this.assetno = assetno;
	}

	public Date getCreationTimestamp() {
		return creationTimestamp;
	}

	public void setCreationTimestamp(Date creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}

	

}
