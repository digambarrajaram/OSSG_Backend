package com.example.OSSG_INVENTORY.Entity;

import java.util.*;

import org.hibernate.annotations.CreationTimestamp;

//import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "hardwarechangelog")
public class HardwareChangelog {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "hid")
	private int hid;

	@Column(name = "assetno")
	private String assetno;

	@Column(name = "deviceserialno")
	private String deviceserialno;

	@Column(name = "ilophysicalip")
	private String ilophysicalip;

	@Column(name = "devicetype")
	private String devicetype;

	@Column(name = "modelno")
	private String modelno;
	
	@Column(name = "cpuseries")
	private String cpuseries;
	
	@Column(name = "project")
	private String project;
	
	@Column(name = "location")
	private String location;
	
	@Column(name = "socket")
	private String socket;
	
	@Column(name = "corepercpu")
	private String corepercpu;
	
	@Column(name = "totalcores")
	private String totalcores;
	
	@Column(name = "memory")
	private String memory;
	
	@Column(name = "physicalhdd")
	private String physicalhdd;
	
	@Column(name = "approvalno")
	private String approvalno;
	
	@Column(name = "approvaldate")
	private String approvaldate;
	
	@Column(name = "pono")
	private String pono;
	
	@Column(name = "podate")
	private String podate;
	
	@Column(name = "devamcwar")
	private String devamcwar;
	
	@Column(name = "warstdate")
	private String warstdate;
	
	@Column(name = "wareddate")
	private String wareddate;
	
	@Column(name = "amcstdate")
	private String amcstdate;
	
	@Column(name = "amceddate")
	private String amceddate;
	
	@Column(name = "expdate")
	private String expdate;
	
	@Column(name = "vdamcname")
	private String vdamcname;
	
	@Column(name = "deviceinsurance")
	private String deviceinsurance;
	
	@Column(name = "principaleosupport")
	private String principaleosupport;
	
	@Column(name = "principaleoservice")
	private String principaleoservice;
	

//	@Temporal(TemporalType.TIMESTAMP)
//	@CreationTimestamp
	@Column(name = "mtime",nullable = false, updatable = false)
	@CreationTimestamp
	private Date mtime;
	
	@Column(name = "user")
	private String user;


	public Date getMtime() {
		return mtime;
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

	public HardwareChangelog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HardwareChangelog(int hid, String assetno, String deviceserialno, String ilophysicalip, String devicetype,
			String modelno, String cpuseries, String project, String location, String socket, String corepercpu,
			String totalcores, String memory, String physicalhdd, String approvalno, String approvaldate, String pono,
			String podate, String devamcwar, String warstdate, String wareddate, String amcstdate, String amceddate,
			String expdate, String vdamcname, String deviceinsurance, String principaleosupport,
			String principaleoservice,Date mtime,String user) {
		super();
		this.hid = hid;
		this.assetno = assetno;
		this.deviceserialno = deviceserialno;
		this.ilophysicalip = ilophysicalip;
		this.devicetype = devicetype;
		this.modelno = modelno;
		this.cpuseries = cpuseries;
		this.project = project;
		this.location = location;
		this.socket = socket;
		this.corepercpu = corepercpu;
		this.totalcores = totalcores;
		this.memory = memory;
		this.physicalhdd = physicalhdd;
		this.approvalno = approvalno;
		this.approvaldate = approvaldate;
		this.pono = pono;
		this.podate = podate;
		this.devamcwar = devamcwar;
		this.warstdate = warstdate;
		this.wareddate = wareddate;
		this.amcstdate = amcstdate;
		this.amceddate = amceddate;
		this.expdate = expdate;
		this.vdamcname = vdamcname;
		this.deviceinsurance = deviceinsurance;
		this.principaleosupport = principaleosupport;
		this.principaleoservice = principaleoservice;
		this.mtime = mtime;
		this.user = user;
	}

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

	public String getDeviceserialno() {
		return deviceserialno;
	}

	public void setDeviceserialno(String deviceserialno) {
		this.deviceserialno = deviceserialno;
	}

	public String getIlophysicalip() {
		return ilophysicalip;
	}

	public void setIlophysicalip(String ilophysicalip) {
		this.ilophysicalip = ilophysicalip;
	}

	public String getDevicetype() {
		return devicetype;
	}

	public void setDevicetype(String devicetype) {
		this.devicetype = devicetype;
	}

	public String getModelno() {
		return modelno;
	}

	public void setModelno(String modelno) {
		this.modelno = modelno;
	}

	public String getCpuseries() {
		return cpuseries;
	}

	public void setCpuseries(String cpuseries) {
		this.cpuseries = cpuseries;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getSocket() {
		return socket;
	}

	public void setSocket(String socket) {
		this.socket = socket;
	}

	public String getCorepercpu() {
		return corepercpu;
	}

	public void setCorepercpu(String corepercpu) {
		this.corepercpu = corepercpu;
	}

	public String getTotalcores() {
		return totalcores;
	}

	public void setTotalcores(String totalcores) {
		this.totalcores = totalcores;
	}

	public String getMemory() {
		return memory;
	}

	public void setMemory(String memory) {
		this.memory = memory;
	}

	public String getPhysicalhdd() {
		return physicalhdd;
	}

	public void setPhysicalhdd(String physicalhdd) {
		this.physicalhdd = physicalhdd;
	}

	public String getApprovalno() {
		return approvalno;
	}

	public void setApprovalno(String approvalno) {
		this.approvalno = approvalno;
	}

	public String getApprovaldate() {
		return approvaldate;
	}

	public void setApprovaldate(String approvaldate) {
		this.approvaldate = approvaldate;
	}

	public String getPono() {
		return pono;
	}

	public void setPono(String pono) {
		this.pono = pono;
	}

	public String getPodate() {
		return podate;
	}

	public void setPodate(String podate) {
		this.podate = podate;
	}

	public String getDevamcwar() {
		return devamcwar;
	}

	public void setDevamcwar(String devamcwar) {
		this.devamcwar = devamcwar;
	}

	public String getWarstdate() {
		return warstdate;
	}

	public void setWarstdate(String warstdate) {
		this.warstdate = warstdate;
	}

	public String getWareddate() {
		return wareddate;
	}

	public void setWareddate(String wareddate) {
		this.wareddate = wareddate;
	}

	public String getAmcstdate() {
		return amcstdate;
	}

	public void setAmcstdate(String amcstdate) {
		this.amcstdate = amcstdate;
	}

	public String getAmceddate() {
		return amceddate;
	}

	public void setAmceddate(String amceddate) {
		this.amceddate = amceddate;
	}

	public String getExpdate() {
		return expdate;
	}

	public void setExpdate(String expdate) {
		this.expdate = expdate;
	}

	public String getVdamcname() {
		return vdamcname;
	}

	public void setVdamcname(String vdamcname) {
		this.vdamcname = vdamcname;
	}

	public String getDeviceinsurance() {
		return deviceinsurance;
	}

	public void setDeviceinsurance(String deviceinsurance) {
		this.deviceinsurance = deviceinsurance;
	}

	public String getPrincipaleosupport() {
		return principaleosupport;
	}

	public void setPrincipaleosupport(String principaleosupport) {
		this.principaleosupport = principaleosupport;
	}

	public String getPrincipaleoservice() {
		return principaleoservice;
	}

	public void setPrincipaleoservice(String principaleoservice) {
		this.principaleoservice = principaleoservice;
	}
		
}
