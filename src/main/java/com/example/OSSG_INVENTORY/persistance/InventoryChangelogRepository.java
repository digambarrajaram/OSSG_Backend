package com.example.OSSG_INVENTORY.persistance;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.OSSG_INVENTORY.Entity.InventoryChangelog;

public interface InventoryChangelogRepository extends JpaRepository<InventoryChangelog, Integer>{

}
