package com.ruoyi.project.drugmanagement.manufacturer.controller;

import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.drugmanagement.manufacturer.domain.Manufacturer;
import com.ruoyi.project.drugmanagement.manufacturer.service.ManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author vincent
 * @data 2021-7-13 14:24
 **/
@RestController
@RequestMapping("/drugmanagement/manufacturer")
public class ManufacturerController extends BaseController {

    @Autowired
    private ManufacturerService manufacturerService;

    /**
     * 删除
     * @param manufacturerIds
     * @return
     */
    @DeleteMapping("/{manufacturerIds}")
    @Log(title = "生产厂家维护", businessType = BusinessType.DELETE)
    @PreAuthorize("@ss.hasPermi('drugmanagement:manufacturer:remove')")
    public AjaxResult removeManufacturer(@PathVariable Long[] manufacturerIds){
        return toAjax(manufacturerService.removeManufacturerIds(manufacturerIds));
    }



    /**
     * 修改
     * @param manufacturer
     * @return
     */
    @PutMapping
    @Log(title = "生产厂家维护", businessType = BusinessType.UPDATE)
    @PreAuthorize("@ss.hasPermi('drugmanagement:manufacturer:edit')")
    public AjaxResult editManufacturer(@RequestBody Manufacturer manufacturer){
        // 设置修改人姓名
        manufacturer.setUpdateBy(SecurityUtils.getUsername());
        int rows = manufacturerService.updateManufacturer(manufacturer);
        return toAjax(rows);
    }


    /**
     * 主键查询
     * @param manufacturerId
     * @return
     */
    @GetMapping("/{manufacturerId}")
    @PreAuthorize("@ss.hasPermi('drugmanagement:manufacturer:query')")
    public AjaxResult getById(@PathVariable Long manufacturerId){
        Manufacturer manufacturer = manufacturerService.getById(manufacturerId);
        return AjaxResult.success(manufacturer);
    }

    /**
     * 新增
     * @param manufacturer
     * @return
     */
    @PreAuthorize("@ss.hasPermi('drugmanagement:manufacturer:add')")
    @Log(title = "生产厂家维护", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult addManufacturer(@RequestBody Manufacturer manufacturer) {
        manufacturer.setCreateBy(SecurityUtils.getUsername());
        int rows = manufacturerService.addManufacturer(manufacturer);
        return toAjax(rows);
    }


    /**
     * 分页查询
     * @param manufacturer
     * @return
     */
    @PreAuthorize("@ss.hasPermi('drugmanagement:manufacturer:query')")
    @GetMapping("/list")
    public TableDataInfo list(Manufacturer manufacturer) {

        // 分页相关,处理请求参数pageNum，pageSize等。并使用PageHelper处理分页查询。
        startPage();
        // 调用service查询数据库
        List<Manufacturer> list = manufacturerService.selectList(manufacturer);
        //返回
        return getDataTable(list);
    }
}
