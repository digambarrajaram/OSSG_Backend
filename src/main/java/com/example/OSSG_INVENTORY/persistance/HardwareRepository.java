package com.example.OSSG_INVENTORY.persistance;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.OSSG_INVENTORY.Entity.Hardware;

public interface HardwareRepository extends JpaRepository<Hardware, Integer>{

}
