package com.ruoyi.project.drugmanagement.inventory.mapper;

import com.ruoyi.project.drugmanagement.inventory.domain.Inventory;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface InventoryMapper {

    List<Inventory> selectMore(Inventory inventory);


    List<Inventory> findType();

    List<Inventory> selectBatch(Inventory inventory);

    List<Inventory> findFactory();

    List<Inventory> findDrug();

    /**
     * 新增【请填写功能名称】
     *
     * @param  【请填写功能名称】
     * @return 结果
     */
     void insertInventory(Inventory inventory);

}
