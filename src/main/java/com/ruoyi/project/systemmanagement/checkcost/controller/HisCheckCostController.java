package com.ruoyi.project.systemmanagement.checkcost.controller;

import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.systemmanagement.checkcost.domain.HisCheckCost;
import com.ruoyi.project.systemmanagement.checkcost.service.IHisCheckCostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/system/hischek")
public class HisCheckCostController extends BaseController {
    @Autowired
    private IHisCheckCostService hisCheckCostService;

    /*删除*/
    @DeleteMapping("/{checkId}")
    @PreAuthorize("@ss.hasPermi('system:checkcost:remove')")
    public AjaxResult removeCheck(@PathVariable Long[] checkId ) {
        return toAjax(hisCheckCostService.removeCheck(checkId));
    }

    /*修改*/
    @PutMapping
    @PreAuthorize("@ss.hasPermi('system:checkcost:edit')")
    public AjaxResult editCheckCost(@RequestBody HisCheckCost hisCheckCost) {
        hisCheckCost.setUpdateBy(SecurityUtils.getUsername());
        int rows = hisCheckCostService.updateCheck(hisCheckCost);
        return toAjax(rows);
    }

    /*修改的查询*/
    @GetMapping("/{checkId}")
    @PreAuthorize("@ss.hasPermi('system:checkcost:index')")
    public AjaxResult getById(@PathVariable Long checkId) {
        HisCheckCost hisCheck = hisCheckCostService.getCheckById(checkId);
        return AjaxResult.success(hisCheck);
    }

    /*新增*/
    @PreAuthorize("@ss.hasPermi('system:checkcost:add')")
    @PostMapping
    public AjaxResult addHisDept(@RequestBody HisCheckCost hisCheckCost) {
        hisCheckCost.setCreateBy(SecurityUtils.getUsername());
        int rows = hisCheckCostService.addHisCheckCost(hisCheckCost);
        return toAjax(rows);
    }
   /*查询所有*/
    @GetMapping("/all")
    public AjaxResult getAll() {
        return AjaxResult.success(hisCheckCostService.getAll());
    }
    /*查询检查费用*/
    @PreAuthorize("@ss.hasPermi('system:checkcost:index')")
    @GetMapping("/lis")
    public TableDataInfo lis(HisCheckCost hisCheckCost) {
        //分页查询
        startPage();
        //调用service查询数据库
        List<HisCheckCost>list=hisCheckCostService.serviceCheckList(hisCheckCost);
        return getDataTable(list);
    }
}
