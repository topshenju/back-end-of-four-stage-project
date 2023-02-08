package com.ruoyi.project.drugmanagement.warehousingaudit.controller;

import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.drugmanagement.warehousingaudit.domain.Drug;
import com.ruoyi.project.drugmanagement.warehousingaudit.service.WareHousingAuditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author Ada
 * @Date 2021/7/13 19:07
 */
@RestController
@RequestMapping("/system/warehousingaudit")
public class WareHousingAuditController extends BaseController  {

    @Autowired
    private WareHousingAuditService wareHousingAuditService;

    //查询药品列表
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
    public AjaxResult pass(@PathVariable int documentsId) {
        System.out.println("进入审核通过模块");
        System.out.println(documentsId);
        int i = wareHousingAuditService.changeOne(documentsId);
        System.out.println("返回结果：" + i);
        return toAjax(i);
    }

    @GetMapping("/unpass/{documentsId}")
    public AjaxResult unPass(@PathVariable int documentsId) {
        System.out.println(documentsId);
        System.out.println("进入审核不同过单元");
        int change = wareHousingAuditService.change(documentsId);
        return toAjax(change);
    }

}
