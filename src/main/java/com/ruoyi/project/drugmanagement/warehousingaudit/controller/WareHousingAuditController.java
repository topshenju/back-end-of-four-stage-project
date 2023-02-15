package com.ruoyi.project.drugmanagement.warehousingaudit.controller;

import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.drugmanagement.inventory.domain.Inventory;
import com.ruoyi.project.drugmanagement.warehousingaudit.domain.Drug;
import com.ruoyi.project.drugmanagement.warehousingaudit.service.WareHousingAuditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/system/warehousingaudit")
public class WareHousingAuditController extends BaseController  {

    @Autowired
    private WareHousingAuditService wareHousingAuditService;

    //查询订单列表
    @GetMapping("/list")
    @PreAuthorize("@ss.hasPermi('system:warehousingaudit:query')")
    public TableDataInfo list(Drug drug) {
        startPage();
        System.out.println(drug);
        System.out.println("进入后端模块");
        List<Drug> more = wareHousingAuditService.findMore(drug);
        System.out.println(more);
        return getDataTable(more);
    }

    @GetMapping("/{documentsId}")
    @PreAuthorize("@ss.hasPermi('system:warehousingaudit:pass')")
    public AjaxResult pass(@PathVariable String documentsId) {
        System.out.println("进入审核通过模块");
        System.out.println(documentsId);
        int i = wareHousingAuditService.changeOne(documentsId);
        //审核通过后再入库审核处删除   添加至库存查询中批次库存和价格列表中
        wareHousingAuditService.changeNumber(documentsId);



        System.out.println("返回结果：" + i);
        return toAjax(i);
    }

    @GetMapping("/unpass/{documentsId}")
    public AjaxResult unPass(@PathVariable String documentsId) {
        System.out.println(documentsId);
        System.out.println("进入审核不同过单元");
        int change = wareHousingAuditService.change(documentsId);
        return toAjax(change);
    }

    @DeleteMapping("/deleteManufacturer/{documentsId}")
//    @Log(title = "删除", businessType = BusinessType.DELETE)
    @PreAuthorize(("@ss.hasPermi('system:warehousingaudit:remove')"))
    public AjaxResult deleteManufacturer(@PathVariable("documentsId") Long documentsIds){
        String s = String.valueOf(documentsIds);
        int i = wareHousingAuditService.deleteWareHousingAudit(s);
        return toAjax(i);

    }

    @PutMapping
    @Log(title = "修改", businessType = BusinessType.UPDATE)
    @PreAuthorize("@ss.hasPermi('system:warehousingaudit:edit')")
    public AjaxResult updateManufacturer(@RequestBody Drug drug){
        int i = wareHousingAuditService.updateWareHousing(drug);
        return toAjax(i);
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:warehousingaudit:query')")
    @GetMapping(value = "selectone/{documentsId}")
    public AjaxResult selectOneById(@PathVariable("documentsId") int documentsId)
    {
        String s = String.valueOf(documentsId);
        return AjaxResult.success(wareHousingAuditService.selectOneById(s));
    }

    //查询订单列表
    @GetMapping("/selectByRelation")
    public List<Inventory> selectByRelation() {
        List<Inventory> inventories = wareHousingAuditService.selectByRelation();
        return  inventories;
    }

}
