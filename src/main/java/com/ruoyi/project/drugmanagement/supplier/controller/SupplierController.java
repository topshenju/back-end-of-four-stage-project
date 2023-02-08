package com.ruoyi.project.drugmanagement.supplier.controller;


import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.drugmanagement.supplier.domain.Supplier;
import com.ruoyi.project.drugmanagement.supplier.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author vincent
 * @data 2021-7-14 13:46
 **/
@RestController
@RequestMapping("/drugmanagement/supplier")
public class SupplierController extends BaseController {

    @Autowired
    private SupplierService supplierService;

    /**
     * 分页查询
     * @param supplier
     * @return
     */
    @PreAuthorize("@ss.hasPermi('drugmanagement:supplier:query')")
    @GetMapping("/list")
    public TableDataInfo list(Supplier supplier) {
        // 分页相关,处理请求参数pageNum，pageSize等。并使用PageHelper处理分页查询。
        startPage();
        // 调用service查询数据库
        List<Supplier> list = supplierService.selectList(supplier);
        //返回
        return getDataTable(list);
    }

    /**
     * 新增
     * @param supplier
     * @return
     */
    @PreAuthorize("@ss.hasPermi('drugmanagement:supplier:add')")
    @Log(title = "供应商维护" , businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult addSupplier(@RequestBody Supplier supplier) {
        //获取操作人信息
        supplier.setCreateBy(SecurityUtils.getUsername());
        int rows = supplierService.addSupplier(supplier);
        return toAjax(rows);
    }

    /**
     * 主键查询
     * @param supplierId
     * @return
     */
    @GetMapping("/{supplierId}")
    @PreAuthorize("@ss.hasPermi('drugmanagement:supplier:query')")
    public AjaxResult getById(@PathVariable Long supplierId) {
        Supplier supplier = supplierService.getById(supplierId);
        return AjaxResult.success(supplier);
    }

    /**
     * 修改供应商信息
     * @param supplier
     * @return
     */
    @PutMapping
    @Log(title = "供应商信息更新", businessType = BusinessType.UPDATE)
    @PreAuthorize("@ss.hasPermi('drugmanagement:supplier:edit')")
    public AjaxResult editSupplier(@RequestBody Supplier supplier) {
        //设置修改人信息
        supplier.setUpdateBy(SecurityUtils.getUsername());
        int rows = supplierService.updateSupplier(supplier);
        return toAjax(rows);
    }

    @DeleteMapping("/{supplierIds}")
    @Log(title = "供应商信息删除", businessType = BusinessType.DELETE)
    @PreAuthorize("@ss.hasPermi('drugmanagement:supplier:remove')")
    public AjaxResult removeSupplier(@PathVariable Long[] supplierIds) {
        return toAjax(supplierService.removeSuppliers(supplierIds));
    }

}
