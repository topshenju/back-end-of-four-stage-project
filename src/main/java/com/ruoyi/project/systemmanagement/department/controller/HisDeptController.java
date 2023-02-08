package com.ruoyi.project.systemmanagement.department.controller;

import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.systemmanagement.department.domain.HisDept;
import com.ruoyi.project.systemmanagement.department.service.IHisDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/system/hisdept")
public class HisDeptController extends BaseController {
    @Autowired
    private IHisDeptService hisDeptService;

    /*删除*/
    @DeleteMapping("/{deptId}")
    @PreAuthorize("@ss.hasPermi('system:hisdept:remove')")
    public AjaxResult removeDept(@PathVariable Long[] deptId) {
        return toAjax(hisDeptService.removeDept(deptId));
    }

    /*修改*/

    @PreAuthorize("@ss.hasPermi('system:hisdept:edit')")
    @PutMapping
    public AjaxResult editDept(@RequestBody HisDept hisDept) {
        hisDept.setUpdateBy(SecurityUtils.getUsername());
        int rows = hisDeptService.updateDept(hisDept);
        return toAjax(rows);
    }

    /*修改的查询*/
    @GetMapping("/{deptId}")
    @PreAuthorize("@ss.hasPermi('system:hisdept:index')")
    public AjaxResult getById(@PathVariable Long deptId) {
        HisDept hisDept = hisDeptService.getById(deptId);
        return AjaxResult.success(hisDept);
    }

    /*新增科室*/
    @PreAuthorize("@ss.hasPermi('system:hisdept:add')")
    @PostMapping
    public AjaxResult addHisDept(@RequestBody HisDept hisDept) {
        hisDept.setCreateBy(SecurityUtils.getUsername());
        int rows = hisDeptService.addHisDept(hisDept);
        return toAjax(rows);
    }

    /*查询科室*/
    @PreAuthorize("@ss.hasPermi('system:hisdept:index')")
    @GetMapping("/list")
    public TableDataInfo list(HisDept hisDept) {
        //分页相关，
        startPage();
        //调用service查询数据库
        List<HisDept> list = hisDeptService.selectList(hisDept);
        return getDataTable(list);
    }

}
