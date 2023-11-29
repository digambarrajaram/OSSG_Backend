package com.example.OSSG_INVENTORY.persistance;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.OSSG_INVENTORY.Entity.HardwareChangelog;

public interface HardwareChangelogRepository extends JpaRepository<HardwareChangelog, Integer>{

}
