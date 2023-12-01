package com.example.OSSG_INVENTORY.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.OSSG_INVENTORY.Entity.Hardware;
import com.example.OSSG_INVENTORY.Entity.HardwareChangelog;
import com.example.OSSG_INVENTORY.Entity.Inventory;
import com.example.OSSG_INVENTORY.Entity.InventoryChangelog;
import com.example.OSSG_INVENTORY.Entity.Users;
import com.example.OSSG_INVENTORY.persistance.HardwareChangelogRepository;
import com.example.OSSG_INVENTORY.persistance.HardwareRepository;
import com.example.OSSG_INVENTORY.persistance.InventoryChangelogRepository;
import com.example.OSSG_INVENTORY.persistance.InventoryRepository;
import com.example.OSSG_INVENTORY.persistance.UserRepository;

import jakarta.transaction.Transactional;

@Service
public class Service_Implementation implements Service_Declarations {

	private InventoryRepository ir;
	private HardwareRepository hr;
	private UserRepository ur;

	private HardwareChangelogRepository hcr;
	private InventoryChangelogRepository icr;

	@Autowired
	public Service_Implementation(InventoryRepository ir, HardwareRepository hr, UserRepository ur, InventoryChangelogRepository icr,HardwareChangelogRepository hcr) {

		super();
		this.ir = ir;
		this.hr = hr;
		this.ur = ur;

		this.hcr = hcr;

		this.icr = icr;

	}

	@Override
	@Transactional
	public List<Inventory> getAllServers() {
		return ir.findAll();
	}

	@Override
	@Transactional
	public void addServer(Inventory inventory) {
		ir.save(inventory);

	}

	@Override
	@Transactional
	public void deleteServer(int sid) {
		ir.deleteById(sid);
	}

	@Override
	@Transactional
	public List<Hardware> getAllHardware() {
		// TODO Auto-generated method stub
		return hr.findAll();
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
		hr.deleteById(hid);
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
		return icr.findAll();
	}

}
