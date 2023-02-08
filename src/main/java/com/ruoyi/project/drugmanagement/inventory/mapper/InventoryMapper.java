package com.ruoyi.project.drugmanagement.inventory.mapper;

import com.ruoyi.project.drugmanagement.inventory.domain.Inventory;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author Ada
 * @Date 2021/7/14 13:56
 */
@Mapper
public interface InventoryMapper {

    List<Inventory> selectMore(Inventory inventory);


    List<Inventory> findType();

    List<Inventory> selectBatch(Inventory inventory);

    List<Inventory> findFactory();

    List<Inventory> findDrug();

}
