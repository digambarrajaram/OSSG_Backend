package com.example.OSSG_INVENTORY.Entity;
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
	private Date mtime = new Date();
	
	@Column(name = "user")
	private String user;
	

	public Date getMtime() {
		return this.mtime;
	}

	public void setMtime(Date mtime) {
   
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
	}

	public InventoryChangelog(int sid, int uniqueid, String remark, Date mtime, String user) {
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
