package com.ruoyi.project.drugmanagement.warehousingaudit.service.impl;

import com.ruoyi.project.drugmanagement.druginformation.domain.Druginformation;
import com.ruoyi.project.drugmanagement.druginformation.mapper.DruginformationMapper;
import com.ruoyi.project.drugmanagement.inventory.domain.Inventory;
import com.ruoyi.project.drugmanagement.inventory.mapper.InventoryMapper;
import com.ruoyi.project.drugmanagement.warehousingaudit.domain.Drug;
import com.ruoyi.project.drugmanagement.warehousingaudit.mapper.WareHousingAuditMapper;
import com.ruoyi.project.drugmanagement.warehousingaudit.service.WareHousingAuditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


@Service
public class WareHousingAuditServiceImpl implements WareHousingAuditService {

    @Autowired
    private WareHousingAuditMapper wareHousingAuditMapper;
    @Autowired
    private InventoryMapper inventoryMapper;
    @Autowired
    private DruginformationMapper druginformationMapper;

    @Override
    public List<Drug> findMore(Drug drug) {
        System.out.println("进入service模块");
        List<Drug> drugs = wareHousingAuditMapper.selectMore(drug);
        return drugs;
    }

    @Override
    public int changeOne(String documentsId) {
        return wareHousingAuditMapper.updateOne(documentsId);

    }

    @Override
    public int change(String documentsId) {
        return wareHousingAuditMapper.update(documentsId);
    }

    @Override
    public int updateWareHousing(Drug drug) {
        return wareHousingAuditMapper.updateWareHousing(drug);
    }

    @Override
    public int deleteWareHousingAudit(String id) {
        return wareHousingAuditMapper.deleteWareHousingAudit(id);
    }

    @Override
    public Drug selectOneById(String documentsId) {
        return  wareHousingAuditMapper.selectOneById(documentsId);
    }

    @Override
        public void changeNumber(String documentsId) {
        //审核通过后再入库审核处删除
        String s = String.valueOf(documentsId);
        wareHousingAuditMapper.deleteWareHousingAudit(s);
        //添加至库存查询中批次库存和价格列表中
        List<Inventory> inventories = wareHousingAuditMapper.selectByRelation();
                //将查询出的药品数量添加到总库存中
//        Druginformation druginformation =new Druginformation();
//        for(int i=0;i<inventories.size();i++){
//            Inventory inventory = inventories.get(i);
//            System.out.println("123");
//
//            druginformation.setInventory(inventory.getInventory());
//            druginformationMapper.update(druginformation);
//        }

        for(int i=0;i<inventories.size();i++){
            System.out.println("进入"+inventories);
            inventories.get(i).setCreateTime(new Date());
            inventoryMapper.insertInventory(inventories.get(i));
        }
    }

    @Override
    public List<Inventory> selectByRelation() {
        return wareHousingAuditMapper.selectByRelation();
    }


}
