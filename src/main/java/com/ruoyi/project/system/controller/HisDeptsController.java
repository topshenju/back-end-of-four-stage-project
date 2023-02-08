package com.ruoyi.project.system.controller;

import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.system.domain.HisDepts;
import com.ruoyi.project.system.service.IHisDeptsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 科室信息Controller
 * 
 * @author ruoyi
 * @date 2023-02-07
 */
@RestController
@RequestMapping("/system/depts")
public class HisDeptsController extends BaseController
{
    @Autowired
    private IHisDeptsService hisDeptsService;

    /**
     * 查询科室信息列表
     */
//    @PreAuthorize("@ss.hasPermi('system:depts:list')")
    @GetMapping("/list")
    public TableDataInfo list(HisDepts hisDepts)
    {
        startPage();
        List<HisDepts> list = hisDeptsService.selectHisDeptsList(hisDepts);
        return getDataTable(list);
    }

    /**
     * 导出科室信息列表
     */
//    @PreAuthorize("@ss.hasPermi('system:depts:export')")
    @Log(title = "科室信息", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(HisDepts hisDepts)
    {
        List<HisDepts> list = hisDeptsService.selectHisDeptsList(hisDepts);
        ExcelUtil<HisDepts> util = new ExcelUtil<HisDepts>(HisDepts.class);
        return util.exportExcel(list, "depts");
    }

    /**
     * 获取科室信息详细信息
     */
//    @PreAuthorize("@ss.hasPermi('system:depts:query')")
    @GetMapping(value = "/{deptsId}")
    public AjaxResult getInfo(@PathVariable("deptsId") Long deptsId)
    {
        return AjaxResult.success(hisDeptsService.selectHisDeptsById(deptsId));
    }

    /**
     * 新增科室信息
     */
//    @PreAuthorize("@ss.hasPermi('system:depts:add')")
    @Log(title = "科室信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HisDepts hisDepts)
    {
        return toAjax(hisDeptsService.insertHisDepts(hisDepts));
    }

    /**
     * 修改科室信息
     */
//    @PreAuthorize("@ss.hasPermi('system:depts:edit')")
    @Log(title = "科室信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HisDepts hisDepts)
    {
        return toAjax(hisDeptsService.updateHisDepts(hisDepts));
    }

    /**
     * 删除科室信息
     */
//    @PreAuthorize("@ss.hasPermi('system:depts:remove')")
    @Log(title = "科室信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{deptsIds}")
    public AjaxResult remove(@PathVariable Long[] deptsIds)
    {
        return toAjax(hisDeptsService.deleteHisDeptsByIds(deptsIds));
    }
}
