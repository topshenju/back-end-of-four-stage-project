package com.ruoyi.project.drugmanagement.inventory.service.impl;

import com.ruoyi.project.drugmanagement.inventory.domain.Inventory;
import com.ruoyi.project.drugmanagement.inventory.mapper.InventoryMapper;
import com.ruoyi.project.drugmanagement.inventory.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class InventoryServiceImpl implements InventoryService {

    @Autowired
    private InventoryMapper inventoryMapper;

    @Override
    public List<Inventory> findMore(Inventory inventory) {
        return inventoryMapper.selectMore(inventory);
    }

    @Override
    public List<Inventory> getType() {
        return inventoryMapper.findType();
    }

    @Override
    public List<Inventory> findBatch(Inventory inventory) {
        return inventoryMapper.selectBatch(inventory);
    }

    @Override
    public List<Inventory> getFactory() {
        return inventoryMapper.findFactory();
    }

    @Override
    public List<Inventory> getDrug() {
        return inventoryMapper.findDrug();
    }


}
