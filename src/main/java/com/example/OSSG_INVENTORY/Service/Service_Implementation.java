package com.example.OSSG_INVENTORY.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.OSSG_INVENTORY.Entity.Inventory;
import com.example.OSSG_INVENTORY.persistance.InventoryRepository;

import jakarta.transaction.Transactional;

@Service
public class Service_Implementation implements Service_Declarations {

	private InventoryRepository ir;

	@Autowired
	public Service_Implementation(InventoryRepository ir) {
		super();
		this.ir = ir;
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

}
