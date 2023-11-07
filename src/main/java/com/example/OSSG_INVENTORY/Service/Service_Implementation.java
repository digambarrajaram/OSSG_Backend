package com.example.OSSG_INVENTORY.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.OSSG_INVENTORY.Entity.Hardware;
import com.example.OSSG_INVENTORY.Entity.Inventory;
import com.example.OSSG_INVENTORY.persistance.HardwareRepository;
import com.example.OSSG_INVENTORY.persistance.InventoryRepository;

import jakarta.transaction.Transactional;

@Service
public class Service_Implementation implements Service_Declarations {

	private InventoryRepository ir;
	private HardwareRepository hr;

	@Autowired
	public Service_Implementation(InventoryRepository ir, HardwareRepository hr) {
		super();
		this.ir = ir;
		this.hr = hr;
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

}
