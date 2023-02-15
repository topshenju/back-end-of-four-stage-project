package com.ruoyi.project.drugmanagement.inventory.service;

import com.ruoyi.project.drugmanagement.inventory.domain.Inventory;

import java.util.List;


public interface InventoryService {

    List<Inventory> findMore(Inventory inventory);


    List<Inventory> getType();

    List<Inventory> findBatch(Inventory inventory);

    List<Inventory> getFactory();

    List<Inventory> getDrug();



}
