package com.example.OSSG_INVENTORY.persistance;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.OSSG_INVENTORY.Entity.SoftwareChangelog;

public interface SoftwareChangelogRepository extends JpaRepository<SoftwareChangelog, Integer>{

}
