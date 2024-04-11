package com.example.OSSG_INVENTORY.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "software")
public class Software {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sofid")
	private int sofid;

	@Column(name = "soft_name")
	private String soft_name;

	@Column(name = "approval_no")
	private String approval_no;

	@Column(name = "approval_date")
	private String approval_date;

	@Column(name = "po_no")
	private String po_no;

	@Column(name = "po_date")
	private String po_date;

	@Column(name = "asc_startdate")
	private String asc_startdate;

	@Column(name = "asc_enddate")
	private String asc_enddate;

	@Column(name = "no_of_lic")
	private String no_of_lic;

	@Column(name = "fin_year")
	private String fin_year;
	
	@Column(name = "app_wfms_no")
	private String app_wfms_no;
	
	@Column(name = "po_wfms_no")
	private String po_wfms_no;
	
	@Column(name = "remark")
	private String remark;
	
	@Column(name = "renewal")
	private String renewal;
	
	@Column(name = "vendor_name")
	private String vendor_name;
	
	@Column(name = "deleted")
	private boolean deleted=false;
	
	

	public Software() {
		super();
	}



	public Software(int sofid, String soft_name, String approval_no, String approval_date, String po_no, String po_date,
			String asc_startdate, String asc_enddate, String no_of_lic, String fin_year,String app_wfms_no, String po_wfms_no,String remark, boolean deleted, String renewal, String vendor_name) {
		super();
		this.sofid = sofid;
		this.soft_name = soft_name;
		this.approval_no = approval_no;
		this.approval_date = approval_date;
		this.po_no = po_no;
		this.po_date = po_date;
		this.asc_startdate = asc_startdate;
		this.asc_enddate = asc_enddate;
		this.no_of_lic = no_of_lic;
		this.fin_year = fin_year;
		this.deleted = deleted;
		this.app_wfms_no = app_wfms_no;
		this.remark = remark;
		this.renewal = renewal;
		this.vendor_name = vendor_name;
		this.po_wfms_no = po_wfms_no;
	}




	public int getSofid() {
		return sofid;
	}



	public void setSofid(int sofid) {
		this.sofid = sofid;
	}



	public String getSoft_name() {
		return soft_name;
	}



	public void setSoft_name(String soft_name) {
		this.soft_name = soft_name;
	}



	public String getApproval_no() {
		return approval_no;
	}



	public void setApproval_no(String approval_no) {
		this.approval_no = approval_no;
	}



	public String getApproval_date() {
		return approval_date;
	}



	public void setApproval_date(String approval_date) {
		this.approval_date = approval_date;
	}



	public String getPo_no() {
		return po_no;
	}



	public void setPo_no(String po_no) {
		this.po_no = po_no;
	}



	public String getPo_date() {
		return po_date;
	}



	public void setPo_date(String po_date) {
		this.po_date = po_date;
	}



	public String getAsc_startdate() {
		return asc_startdate;
	}



	public void setAsc_startdate(String asc_startdate) {
		this.asc_startdate = asc_startdate;
	}



	public String getAsc_enddate() {
		return asc_enddate;
	}



	public void setAsc_enddate(String asc_enddate) {
		this.asc_enddate = asc_enddate;
	}



	public String getNo_of_lic() {
		return no_of_lic;
	}



	public void setNo_of_lic(String no_of_lic) {
		this.no_of_lic = no_of_lic;
	}



	public String getVendor_name() {
		return vendor_name;
	}



	public void setVendor_name(String vendor_name) {
		this.vendor_name = vendor_name;
	}



	public String getFin_year() {
		return fin_year;
	}



	public void setFin_year(String fin_year) {
		this.fin_year = fin_year;
	}



	public String getWfms_no() {
		return app_wfms_no;
	}



	public void setWfms_no(String wfms_no) {
		this.app_wfms_no = wfms_no;
	}



	public String getRenewal() {
		return renewal;
	}



	public void setRenewal(String renewal) {
		this.renewal = renewal;
	}



	public String getRemark() {
		return remark;
	}



	public void setRemark(String remark) {
		this.remark = remark;
	}



	public String getPo_wfms_no() {
		return po_wfms_no;
	}



	public void setPo_wfms_no(String po_wfms_no) {
		this.po_wfms_no = po_wfms_no;
	}



	public boolean isDeleted() {
		return deleted;
	}


	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}


}
