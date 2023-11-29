package com.example.OSSG_INVENTORY.Service;

import java.util.List;

import com.example.OSSG_INVENTORY.Entity.Hardware;
import com.example.OSSG_INVENTORY.Entity.Inventory;
import com.example.OSSG_INVENTORY.Entity.Users;


public interface Service_Declarations {
	
	public List<Inventory> getAllServers();

	public void addServer(Inventory inventory);
	
	public void deleteServer(int sid);
	
	public List<Hardware> getAllHardware();

	public void addHardware(Hardware hardware);
	
	public void deleteHardware(int hid);
	
	public void signup(Users user);
	
	public Users getByUsername(String username);
	
	public List<String> getLocation();
}
