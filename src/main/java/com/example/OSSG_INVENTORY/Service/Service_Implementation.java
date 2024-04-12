package com.example.OSSG_INVENTORY.Service;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.hibernate.boot.query.BootQueryLogging;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.servlet.MultipartAutoConfiguration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import lombok.*;

import com.example.OSSG_INVENTORY.Entity.FileUploadResponse;
import com.example.OSSG_INVENTORY.Entity.Hardware;
import com.example.OSSG_INVENTORY.Entity.HardwareChangelog;
import com.example.OSSG_INVENTORY.Entity.Inventory;
import com.example.OSSG_INVENTORY.Entity.InventoryChangelog;
import com.example.OSSG_INVENTORY.Entity.Software;
import com.example.OSSG_INVENTORY.Entity.SoftwareChangelog;
import com.example.OSSG_INVENTORY.Entity.Users;
import com.example.OSSG_INVENTORY.persistance.FileUploadResponseRepository;
import com.example.OSSG_INVENTORY.persistance.HardwareChangelogRepository;
import com.example.OSSG_INVENTORY.persistance.HardwareRepository;
import com.example.OSSG_INVENTORY.persistance.InventoryChangelogRepository;
import com.example.OSSG_INVENTORY.persistance.InventoryRepository;
import com.example.OSSG_INVENTORY.persistance.SoftwareChangelogRepository;
import com.example.OSSG_INVENTORY.persistance.SoftwareRepository;
import com.example.OSSG_INVENTORY.persistance.UserRepository;

import jakarta.persistence.Table;
import jakarta.transaction.Transactional;

@Service
public class Service_Implementation implements Service_Declarations {
	
	private Path foundFile;

	private InventoryRepository ir;
	private HardwareRepository hr;
	private UserRepository ur;
	private SoftwareRepository sr;

	private HardwareChangelogRepository hcr;
	private InventoryChangelogRepository icr;
	private SoftwareChangelogRepository scr;
	
	private FileUploadResponseRepository fur;
	
	

	@Autowired
	public Service_Implementation(InventoryRepository ir, HardwareRepository hr, UserRepository ur,SoftwareRepository sr,FileUploadResponseRepository fur, InventoryChangelogRepository icr,HardwareChangelogRepository hcr, SoftwareChangelogRepository scr) {

		super();
		this.ir = ir;
		this.hr = hr;
		this.ur = ur;
		this.sr = sr;
		this.hcr = hcr;
		this.icr = icr;
		this.scr = scr;
		this.fur = fur;

	}

	@Override
	@Transactional
	public List<Inventory> getAllServers(boolean flag) {
		return ir.getAll(flag);
	}

	@Override
	@Transactional
	public void addServer(Inventory inventory) {
		ir.save(inventory);

	}

	@Override
	@Transactional
	public void deleteServer(int sid) {
		ir.deletedServer(sid);
	}

	@Override
	@Transactional
	public List<Hardware> getAllHardware(boolean flag){
		// TODO Auto-generated method stub
		return hr.getAll(flag);
	}

	@Override
	@Transactional
	public void addHardware(Hardware hardware) {
		// TODO Auto-generated method stub
		hr.save(hardware);
	}

	@Override
	@Transactional
	public void deleteHardware(int hid) {
		// TODO Auto-generated method stub
		hr.deletedHardwareServer(hid);
	}

	@Override
	@Transactional
	public void signup(Users user) {
		// TODO Auto-generated method stub
		ur.save(user);
	}

	@Override
	@Transactional
	public Users getByUsername(String username) {
		// TODO Auto-generated method stub

		return ur.getByUsername(username);
	}

	@Override
	@Transactional
	public List<String> getLocation() {
		// TODO Auto-generated method stub
		return hr.getLocation();
	}

	@Override
	@Transactional
	public void changeLog(HardwareChangelog h) {
		// TODO Auto-generated method stub
		hcr.save(h);
		
	}
	
	@Override
	@Transactional
	public void addToInvChaLog(InventoryChangelog ic) {
		// TODO Auto-generated method stub
		 icr.save(ic);
	}

	@Override
	@Transactional
	public Inventory getLinuxById(int sid) {
		// TODO Auto-generated method stub
		return ir.findById(sid).get();
	}

	@Override
	@Transactional
	public List<InventoryChangelog> getAllLinuxChangeLog() {
		// TODO Auto-generated method stub
		List<InventoryChangelog> originallist = icr.findAll();
		Collections.reverse(originallist);
		return originallist;
	}

	@Override
	@Transactional
	public Integer getId() {
		// TODO Auto-generated method stub
		return ir.getId();
	}

	@Override
	@Transactional
	public Hardware getHardwareById(int hid) {
		// TODO Auto-generated method stub
		return hr.findById(hid).get();
	}

	@Override
	@Transactional
	public List<HardwareChangelog> getAllHardwareChangeLog() {
		// TODO Auto-generated method stub
		List<HardwareChangelog> originallist = hcr.findAll();
		Collections.reverse(originallist);
		return originallist;
	}

	@Override
	@Transactional
	public Integer gethId() {
		// TODO Auto-generated method stub
		return hr.gethardId();
	}

	@Override
	@Transactional
	public Software getSoftwareById(int sofid) {
		// TODO Auto-generated method stub
		return sr.findById(sofid).get();
	}
	
	@Override
	@Transactional
	public void changeLog(SoftwareChangelog s) {
		// TODO Auto-generated method stub
		scr.save(s);
		
	}
	
	@Override
	@Transactional
	public void addSoftware(Software software) {
		// TODO Auto-generated method stub
		sr.save(software);
	}
	
	@Override
	@Transactional
	public Integer getsofId() {
		// TODO Auto-generated method stub
		return sr.getsofId();
	}
	
	@Override
	@Transactional
	public void deleteSoftware(int sofid) {
		// TODO Auto-generated method stub
		sr.deletedSoftwareServer(sofid);
	}
	
	@Override
	@Transactional
	public List<Software> getAllSoftware(boolean flag){
		// TODO Auto-generated method stub
		return sr.getAll(flag);
	}
	
	@Override
	@Transactional
	public List<SoftwareChangelog> getAllSoftwareChangeLog() {
		// TODO Auto-generated method stub
		List<SoftwareChangelog> originallist = scr.findAll();
		Collections.reverse(originallist);
		return originallist;
	}
	
	
	public static String saveFile(String fileName, MultipartFile multipartfile) throws IOException {
		Path uploadDirectory = Paths.get("/home/iauser/Downloads/FILES");
		
		String fileCode = RandomStringUtils.randomAlphanumeric(8);
		try(InputStream inputStream = multipartfile.getInputStream()){
			Path filePath = uploadDirectory.resolve(fileCode + "-"+ fileName);
			Files.copy(inputStream,  filePath, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException ioe) {
			throw new IOException("Error Saving uploaded file: "+ fileName, ioe);
		}
		
		return fileCode;
	}
	
	public Resource downloadFile(String fileCode) throws IOException {
		Path uploadDirector = Paths.get("/home/iauser/Downloads/FILES");
		
		Files.list(uploadDirector).forEach(file -> {
			if(file.getFileName().toString().startsWith(fileCode)) {
				foundFile = file;
				return;
			}
		});
		
		if(foundFile != null) {
			return new UrlResource(foundFile.toUri());
		}
		return null;
	}
	
	@Override
	@Transactional
	public void fileSaveDB(FileUploadResponse fr) {
		// TODO Auto-generated method stub
		fur.save(fr);
		
	}
	
	@Override
	@Transactional
	public String getdownloaduri(String sofid) {
		// TODO Auto-generated method stub
		return sr.getdownloaduri(sofid);
	}
	
	@Override
	@Transactional
	public void adddownloaduri(String filename, String sofid) {
		// TODO Auto-generated method stub
		 sr.adddownloadurl(filename,sofid);
	}
	
}
