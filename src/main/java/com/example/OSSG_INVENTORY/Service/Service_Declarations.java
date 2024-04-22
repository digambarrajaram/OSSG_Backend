package com.example.OSSG_INVENTORY.Service;

import java.util.List;

import com.example.OSSG_INVENTORY.Entity.FileUploadResponse;
import com.example.OSSG_INVENTORY.Entity.Hardware;
import com.example.OSSG_INVENTORY.Entity.HardwareChangelog;
import com.example.OSSG_INVENTORY.Entity.Inventory;
import com.example.OSSG_INVENTORY.Entity.InventoryChangelog;
import com.example.OSSG_INVENTORY.Entity.Software;
import com.example.OSSG_INVENTORY.Entity.SoftwareChangelog;
import com.example.OSSG_INVENTORY.Entity.Users;


public interface Service_Declarations {
	
	public List<Inventory> getAllServers(boolean flag);

	public void addServer(Inventory inventory);
	
	public void deleteServer(int sid);
	
	public List<Hardware> getAllHardware(boolean flag);

	public void addHardware(Hardware hardware);
	
	public void deleteHardware(int hid);
	
	public void signup(Users user);
	
	public Users getByUsername(String username);
	
	public List<String> getLocation();
	
	public void addToInvChaLog(InventoryChangelog ic);

	public void changeLog(HardwareChangelog h);
	
	public Inventory getLinuxById(int sid);
	
	public List<InventoryChangelog> getAllLinuxChangeLog();
	
	public Integer getId();
	
	public Hardware getHardwareById(int hid);

	
	public List<HardwareChangelog> getAllHardwareChangeLog();
	
	public Integer gethId();
	
	public Software getSoftwareById(int sofid);
	
	public void changeLog(SoftwareChangelog s);
	
	public void addSoftware(Software software);
	
	public Integer getsofId();
	
	public void deleteSoftware(int sofid);
	
	public List<Software> getAllSoftware(boolean flag);
	
	public List<SoftwareChangelog> getAllSoftwareChangeLog();

	public void fileSaveDB(FileUploadResponse fr);

	public String getdownloaduri(String sofid);

	public void adddownloaduri(String filename, String sofid);
	
	public List<FileUploadResponse> getdownloadinfo(String sofid);

}
