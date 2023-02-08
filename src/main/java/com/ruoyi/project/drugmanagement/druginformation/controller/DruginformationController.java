package com.ruoyi.project.drugmanagement.druginformation.controller;

import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.domain.BaseEntity;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.drugmanagement.druginformation.domain.Druginformation;
import com.ruoyi.project.drugmanagement.druginformation.service.DruginformationService;
import com.ruoyi.project.drugmanagement.manufacturer.domain.Manufacturer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 **/
@RestController
@RequestMapping("/drugmanagement/druginformation")
public class DruginformationController extends BaseController {

    @Autowired
    private DruginformationService druginformationService;

    /**
     * 查询所有药品
     * @return
     */
    @GetMapping("/all")
    public AjaxResult getAll(){
        return AjaxResult.success(druginformationService.getAll());
    }


    /**
     * 查询所有药品
     * @return
     */
    @GetMapping("/getAllMedicine")
    public AjaxResult getAllMedicine(){
        return AjaxResult.success(druginformationService.getAllMedicine());
    }

    /**
     * 查询所有处方
     * @return
     */
    @GetMapping("/getAllPrescription")
    public AjaxResult getAllPrescription(){
        return AjaxResult.success(druginformationService.getAllPrescription());
    }

    /**
     *分页查询
     * @param druginformation
     * @return
     */
    @PreAuthorize("@ss.hasPermi('drugmanagement:druginformation:query')")
    @GetMapping("/list")
    public TableDataInfo list(Druginformation druginformation) {
        startPage();
        List<Druginformation> list = druginformationService.selectList(druginformation);
        return getDataTable(list);
    }

    @PreAuthorize("@ss.hasPermi('drugmanagement:druginformation:add')")
    @Log(title = "添加药品", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult addDruginformation(@RequestBody Druginformation druginformation) {
        druginformation.setCreateBy(SecurityUtils.getUsername());
        int rows = druginformationService.addDrugInformation(druginformation);
        return toAjax(rows);
    }

    /**
     * 主键查询
     * @param maintenanceId
     * @return
     */
    @GetMapping("/{maintenanceId}")
    @PreAuthorize("@ss.hasPermi('drugmanagement:druginformation:query')")
    public AjaxResult getById(@PathVariable Long maintenanceId){
        Druginformation druginformation = druginformationService.getById(maintenanceId);
        return AjaxResult.success(druginformation);
    }

    /**
     * 修改
     * @param druginformation
     * @return
     */
    @PutMapping
    @Log(title = "生产厂家维护", businessType = BusinessType.UPDATE)
    @PreAuthorize("@ss.hasPermi('drugmanagement:druginformation:edit')")
    public AjaxResult editDruginformation(@RequestBody Druginformation druginformation){
        // 设置修改人姓名
        druginformation.setUpdateBy(SecurityUtils.getUsername());
        int rows = druginformationService.updateDrugInformation(druginformation);
        return toAjax(rows);
    }

    /**
     * 删除
     * @param maintenanceIds
     * @return
     */
    @DeleteMapping("/{maintenanceIds}")
    @Log(title = "生产厂家维护", businessType = BusinessType.DELETE)
    @PreAuthorize("@ss.hasPermi('drugmanagement:druginformation:remove')")
    public AjaxResult removeDruginformation(@PathVariable Long[] maintenanceIds){
        return toAjax(druginformationService.removeDrugInformation(maintenanceIds));
    }
}
