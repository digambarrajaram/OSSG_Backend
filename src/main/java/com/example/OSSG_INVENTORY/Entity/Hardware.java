package com.example.OSSG_INVENTORY.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "hardware")
public class Hardware {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "hid")
	private int hid;

	//newly added
	@Column(name = "hardwarecategory")
	private String hardwarecategory;
	
	//newly added
	@Column(name = "oem")
	private String oem;
	
	@Column(name = "vdamcname")
	private String vdamcname;
	
	//newly added
	@Column(name = "awe")
	private String awe;
	
	@Column(name = "assetno")
	private String assetno;
	
	@Column(name = "serialno")
	private String serialno;	
	
	@Column(name = "ilophysicalip")
	private String ilophysicalip;
	
	@Column(name = "typeoros")
	private String typeoros;
	
	
	@Column(name = "modela")
	private String modela;
	
	
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
	
	
	@Column(name = "approvalwfmsno")
	private String approvalwfmsno;
	
	@Column(name = "pono")
	private String pono;
	
	@Column(name = "podate")
	private String podate;
	
	@Column(name = "powfmsno")
	private String powfmsno;
	
	@Column(name = "warstdate")
	private String warstdate;
	
	@Column(name = "wareddate")
	private String wareddate;
	
	@Column(name = "amcstdate")
	private String amcstdate;
	
	@Column(name = "amceddate")
	private String amceddate;
	
	@Column(name = "deviceinsurance")
	private String deviceinsurance;
	
	@Column(name = "principaleosupport")
	private String principaleosupport;
	
	@Column(name = "machinetype")
	private String machinetype;
	
	@Column(name = "modelb")
	private String modelb;
	
	
	@Column(name = "remark")
	private String remark;
	
	
	@Column(name = "deleted")
	private boolean deleted=false;

	public Hardware() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hardware(int hid, String hardwarecategory, String oem, String vdamcname, String awe, String assetno,
			String serialno, String ilophysicalip, String typeoros, String modela, String cpuseries, String project,
			String location, String socket, String corepercpu, String totalcores, String memory, String physicalhdd,
			String approvalno, String approvaldate, String approvalwfmsno, String pono, String podate, String powfmsno,
			String warstdate, String wareddate, String amcstdate, String amceddate, String deviceinsurance,
			String principaleosupport, String machinetype, String modelb, String remark, boolean deleted) {
		super();
		this.hid = hid;
		this.hardwarecategory = hardwarecategory;
		this.oem = oem;
		this.vdamcname = vdamcname;
		this.awe = awe;
		this.assetno = assetno;
		this.serialno = serialno;
		this.ilophysicalip = ilophysicalip;
		this.typeoros = typeoros;
		this.modela = modela;
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
		this.approvalwfmsno = approvalwfmsno;
		this.pono = pono;
		this.podate = podate;
		this.powfmsno = powfmsno;
		this.warstdate = warstdate;
		this.wareddate = wareddate;
		this.amcstdate = amcstdate;
		this.amceddate = amceddate;
		this.deviceinsurance = deviceinsurance;
		this.principaleosupport = principaleosupport;
		this.machinetype = machinetype;
		this.modelb = modelb;
		this.remark = remark;
		this.deleted = deleted;
	}

	public int getHid() {
		return hid;
	}

	public void setHid(int hid) {
		this.hid = hid;
	}

	public String getHardwarecategory() {
		return hardwarecategory;
	}

	public void setHardwarecategory(String hardwarecategory) {
		this.hardwarecategory = hardwarecategory;
	}

	public String getOem() {
		return oem;
	}

	public void setOem(String oem) {
		this.oem = oem;
	}

	public String getVdamcname() {
		return vdamcname;
	}

	public void setVdamcname(String vdamcname) {
		this.vdamcname = vdamcname;
	}

	public String getAwe() {
		return awe;
	}

	public void setAwe(String awe) {
		this.awe = awe;
	}

	public String getAssetno() {
		return assetno;
	}

	public void setAssetno(String assetno) {
		this.assetno = assetno;
	}

	public String getSerialno() {
		return serialno;
	}

	public void setSerialno(String serialno) {
		this.serialno = serialno;
	}

	public String getIlophysicalip() {
		return ilophysicalip;
	}

	public void setIlophysicalip(String ilophysicalip) {
		this.ilophysicalip = ilophysicalip;
	}

	public String getTypeoros() {
		return typeoros;
	}

	public void setTypeoros(String typeoros) {
		this.typeoros = typeoros;
	}

	public String getModela() {
		return modela;
	}

	public void setModela(String modela) {
		this.modela = modela;
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

	public String getApprovalwfmsno() {
		return approvalwfmsno;
	}

	public void setApprovalwfmsno(String approvalwfmsno) {
		this.approvalwfmsno = approvalwfmsno;
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

	public String getPowfmsno() {
		return powfmsno;
	}

	public void setPowfmsno(String powfmsno) {
		this.powfmsno = powfmsno;
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

	public String getMachinetype() {
		return machinetype;
	}

	public void setMachinetype(String machinetype) {
		this.machinetype = machinetype;
	}

	public String getModelb() {
		return modelb;
	}

	public void setModelb(String modelb) {
		this.modelb = modelb;
	}
	

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

}