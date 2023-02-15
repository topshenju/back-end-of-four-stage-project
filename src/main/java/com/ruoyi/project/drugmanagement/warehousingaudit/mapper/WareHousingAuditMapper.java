package com.ruoyi.project.drugmanagement.warehousingaudit.mapper;

import com.ruoyi.project.drugmanagement.inventory.domain.Inventory;
import com.ruoyi.project.drugmanagement.warehousingaudit.domain.Drug;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface WareHousingAuditMapper {

    List<Drug> selectMore(Drug drug);

    int updateOne(String documentsId);

    int update(String documentsId);

    int updateWareHousing(Drug drug);

    int deleteWareHousingAudit(@Param("documentsId") String documentsId);

    Drug selectOneById(@Param("documentsId") String documentsId);

    List<Inventory> selectByRelation();



}
