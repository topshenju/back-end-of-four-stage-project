package com.ruoyi.project.drugmanagement.warehousingaudit.service;

import com.ruoyi.project.drugmanagement.inventory.domain.Inventory;
import com.ruoyi.project.drugmanagement.warehousingaudit.domain.Drug;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface WareHousingAuditService {

    List<Drug> findMore(Drug drug);

    int changeOne(String documentsId);

    int change(String documentsId);

    int updateWareHousing(Drug drug);

    int deleteWareHousingAudit(String id);

    Drug selectOneById(String documentsId);


    void changeNumber(String documentsId);

    List<Inventory> selectByRelation();
}
