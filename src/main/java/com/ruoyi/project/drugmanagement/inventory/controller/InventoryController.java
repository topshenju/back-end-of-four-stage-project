package com.ruoyi.project.drugmanagement.inventory.controller;

import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.drugmanagement.inventory.domain.Inventory;
import com.ruoyi.project.drugmanagement.inventory.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author Ada
 * @Date 2021/7/14 13:57
 */
@RestController
@RequestMapping("/system/inventory")
public class InventoryController extends BaseController {

    @Autowired
    private InventoryService inventoryService;

    @GetMapping("/list")
    @PreAuthorize("@ss.hasPermi('system:inventory:query')")
    public TableDataInfo list(Inventory inventory) {
        System.out.println("进入inventory查询单元");
        System.out.println(inventory);
        List<Inventory> more = inventoryService.findMore(inventory);
        return getDataTable(more);
    }

    @GetMapping("/type")
    public AjaxResult type() {
        System.out.println("进入查询药方类型模块");
        System.out.println(inventoryService.getType());
        return AjaxResult.success(inventoryService.getType());
    }

    @GetMapping("/batch")
    @PreAuthorize("@ss.hasPermi('system:inventory:batch')")
    public TableDataInfo batch(Inventory inventory) {
        System.out.println(inventory);
        System.out.println("进入批次查询单元");
        List<Inventory> batch = inventoryService.findBatch(inventory);
        System.out.println(batch);
        return getDataTable(batch);
    }

    @GetMapping("/factory")
    public AjaxResult getFactory() {
        System.out.println("进入厂家类型查询单元");
        List<Inventory> factory = inventoryService.getFactory();
        return AjaxResult.success(factory);
    }

    @GetMapping("/drug")
    public AjaxResult getDrug() {
        System.out.println("进入药品类型查询单元");
        List<Inventory> drug = inventoryService.getDrug();
        return AjaxResult.success(drug);
    }

}
