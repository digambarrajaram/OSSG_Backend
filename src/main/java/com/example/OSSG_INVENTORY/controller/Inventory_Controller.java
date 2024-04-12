package com.example.OSSG_INVENTORY.controller;


import java.io.IOException;
import java.net.http.HttpHeaders;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.example.OSSG_INVENTORY.Entity.*;
import com.example.OSSG_INVENTORY.Service.Service_Implementation;

import io.micrometer.common.util.StringUtils;

@RestController
@RequestMapping("/inventory")
public class Inventory_Controller {
	private Service_Implementation si;
	
	public Inventory_Controller(Service_Implementation si) {
		this.si = si;
	}
	
	@GetMapping("serverlist/{flag}")
	public List<Inventory> getAllServers(@PathVariable("flag") boolean flag){
//		System.out.println(flag.isDeleted());
		return si.getAllServers(flag);
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
		
	@GetMapping("hardwarelist/{flag}")
	public List<Hardware> getAllHardware(@PathVariable("flag") boolean flag){
		return si.getAllHardware(flag);
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
	
	
	@GetMapping("linuxbyid/{sid}")
	public Inventory getLinuxById(@PathVariable("sid") int sid)
	{	
		try {
		return si.getLinuxById(sid);
		} catch (Exception e) {
			return null;
		}
	}
	
	@GetMapping("linuxchangelogslist")
	public List<InventoryChangelog> getLinuxChangeLogList(){
		return si.getAllLinuxChangeLog();
	}
	
	@GetMapping("getsid")
	public Integer getId(){
		return si.getId();
	}
	
	
	@GetMapping("hardwarebyid/{hid}")
	public Hardware getHardwareById(@PathVariable("hid") int hid)
	{	
		try {
		return si.getHardwareById(hid);
		} catch (Exception e) {
			return null;
		}
	}
	
	@GetMapping("hardwarechangelogslist")
	public List<HardwareChangelog> getHardwareChangeLogList(){
		return si.getAllHardwareChangeLog();
	}
	
	@GetMapping("gethid")
	public Integer getHid(){
		return si.gethId();
	}
	
	@GetMapping("softwarebyid/{sofid}")
	public Software getSoftwareById(@PathVariable("sofid") int sofid)
	{	
		try {
		return si.getSoftwareById(sofid);
		} catch (Exception e) {
			return null;
		}
	}
	
	@PostMapping("/softwarechangelog")
    public String softwareChangeLog(@RequestBody SoftwareChangelog socl) {
		try {
			si.changeLog(socl);
			return "Added to Software ChangeLog";
		} catch (Exception e) {
			return "Not Added to Software ChangeLog";
		}
    }
	
	
	@PostMapping("/addsoftware")
	public String addSoftware(@RequestBody Software software) {
		
		try {
			si.addSoftware(software);
			return "Software Added";
		} catch (Exception e) {
			return "Software Not Added";
		}
	}
	
	@GetMapping("getsofid")
	public Integer getSofid(){
		return si.getsofId();
	}
	
	
	@PostMapping("/deletesoftware/{sofid}")
	public String deleteSoftware(@PathVariable("sofid") int sofid) {
		
		try {
			si.deleteSoftware(sofid);
			return "Software Deleted";
		} catch (Exception e) {
			return "Software Not Deleted";
		}
		
	}
	
	@GetMapping("softwarelist/{flag}")
	public List<Software> getAllSoftware(@PathVariable("flag") boolean flag){
		return si.getAllSoftware(flag);
	}
	
	@GetMapping("softwarechangelogslist")
	public List<SoftwareChangelog> getSoftwareChangeLogList(){
		return si.getAllSoftwareChangeLog();
	}
	
	@PostMapping("/uploadfile")
	public String uploadFile(@RequestParam("file") MultipartFile multipartFile, @RequestParam("sofid") String sofid, @RequestParam("user") String user) throws IOException{
		
		 LocalDateTime currentDateTime = LocalDateTime.now();
		 ZonedDateTime now = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));

      // Format the date and time as a string
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy HH:mm:ss");
      String formattedDateTime = now.format(formatter);
      String mtime=formattedDateTime;
      
		String fileName = org.springframework.util.StringUtils.cleanPath(multipartFile.getOriginalFilename());
		long size = multipartFile.getSize();
		
		System.out.println(sofid);
		try {
			String fileCode = si.saveFile(fileName, multipartFile);
			String u = "/downloadfile/"+fileCode;
			FileUploadResponse resp = new FileUploadResponse(fileName, u, size, sofid, user, mtime);
			si.fileSaveDB(resp);
			si.adddownloaduri(u, sofid);
		}catch(Error e){
			return "File Upload Failed "+e;
		}
		
		return "File Uploaded";
		
	}
	
	@GetMapping("/downloadfile/{fileCode}")
	public ResponseEntity<?> downloadFile(@PathVariable("fileCode") String fileCode) throws IOException {
		
		try {
			
			Resource fileAsResource = si.downloadFile(fileCode);
			
			String contentType = "application/octet-stream";
			String headerValue = "attachment; filename=\"" + fileAsResource.getFilename() +"\"";
			
			return ResponseEntity.ok().contentType(MediaType.parseMediaType(contentType))
					.header(org.springframework.http.HttpHeaders.CONTENT_DISPOSITION, headerValue)
					.body(fileAsResource);
			
		}catch(Error e) {
			return new ResponseEntity<>("File not Found", HttpStatus.NOT_FOUND);
		}
	
	}
	
	@GetMapping("/download/{sofid}")
	public String download(@PathVariable("sofid") String sofid) {
		try {
			return si.getdownloaduri(sofid);
			} catch (Exception e) {
				return "Download Url not found";
			}
	}
}
