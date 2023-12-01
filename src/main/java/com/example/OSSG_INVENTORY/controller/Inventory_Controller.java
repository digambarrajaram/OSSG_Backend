package com.example.OSSG_INVENTORY.controller;


import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.example.OSSG_INVENTORY.Entity.*;
import com.example.OSSG_INVENTORY.Service.Service_Implementation;

@RestController
@RequestMapping("/inventory")
public class Inventory_Controller {
	private Service_Implementation si;
	
	public Inventory_Controller(Service_Implementation si) {
		this.si = si;
	}
	
	@GetMapping("serverlist")
	public List<Inventory> getAllServers(){
		return si.getAllServers();
	}

	
	@PostMapping("/addserver")
	public String addServer(@RequestBody Inventory inventory) {
		
		try {
			si.addServer(inventory);
			return "Server Added";
		} catch (Exception e) {
			return "Server Not Added";
		}
	}
	
	@PostMapping("/deleteserver/{sid}")
	public String deleteServer(@PathVariable("sid") int sid) {
		
		try {
			si.deleteServer(sid);
			return "Server Deleted";
		} catch (Exception e) {
			return "Server Not Deleted";
		}
		
	}
		
	@GetMapping("hardwarelist")
	public List<Hardware> getAllHardware(){
		return si.getAllHardware();
	}

	
	@PostMapping("/addhardware")
	public String addHardware(@RequestBody Hardware hardware) {
		
		try {
			si.addHardware(hardware);
			return "Hardware Added";
		} catch (Exception e) {
			return "Hardware Not Added";
		}
	}
	
	@PostMapping("/deletehardware/{hid}")
	public String deleteHardware(@PathVariable("hid") int hid) {
		
		try {
			si.deleteHardware(hid);
			return "Hardware Deleted";
		} catch (Exception e) {
			return "Hardware Not Deleted";
		}
		
	}
	
	@PostMapping("/signup")
	public String signup(@RequestBody Users user) {
		
		try {
			si.signup(user);
			return "User Added";
		} catch (Exception e) {
			return "User Not Added";
		}
		
	}
	
	@GetMapping("login/{username}")
	public Users getByUsername(@PathVariable("username")String username)
	{	
		try {
		return si.getByUsername(username);
		} catch (Exception e) {
			return null;
		}
	}
	
	@GetMapping("location")
	public List<String> getLocation()
	{
		try {
		return si.getLocation();
		} catch (Exception e) {
			return null;
		}
	}
	@PostMapping("/hardwarechangelog")
    public String hardwareChangeLog(@RequestBody HardwareChangelog hcl) {
		try {
			si.changeLog(hcl);
			return "Added to Hardware ChangeLog";
		} catch (Exception e) {
			return "Not Added to Hardware ChangeLog";
		}
    }
	
	@PostMapping("/inventorychangelog")
	public String addToChaLog(@RequestBody InventoryChangelog ic) {
		
		try {
			si.addToInvChaLog(ic);
			return "Added to ChangeLog";
		} catch (Exception e) {
			return "Not Added to ChangeLog";
		}
		
	}
	
}
