package com.ruoyi.project.chargemanagement.refundquery.controller;

import java.util.List;
import com.ruoyi.project.chargemanagement.refundquery.domain.Refundquery1Lpzre;
import com.ruoyi.project.chargemanagement.refundquery.service.IRefundquery1LpzreService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 4.4退费查询Controller
 *
 * @author ruoyi
 * @date 2023-02-08
 */
@RestController
@RequestMapping("/system/lpzre")
public class Refundquery1LpzreController extends BaseController{
    @Autowired
    private IRefundquery1LpzreService refundquery1LpzreService;

    /**
     * 查询4.4退费查询列表
     */
    @PreAuthorize("@ss.hasPermi('system:lpzre:list')")
    @GetMapping("/list")
    public TableDataInfo list(Refundquery1Lpzre refundquery1Lpzre)
    {
        startPage();
        List<Refundquery1Lpzre> list = refundquery1LpzreService.selectRefundquery1LpzreList(refundquery1Lpzre);
        return getDataTable(list);
    }

    /**
     * 导出4.4退费查询列表
     */
    @PreAuthorize("@ss.hasPermi('system:lpzre:export')")
    @Log(title = "4.4退费查询", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(Refundquery1Lpzre refundquery1Lpzre)
    {
        List<Refundquery1Lpzre> list = refundquery1LpzreService.selectRefundquery1LpzreList(refundquery1Lpzre);
        ExcelUtil<Refundquery1Lpzre> util = new ExcelUtil<Refundquery1Lpzre>(Refundquery1Lpzre.class);
        return util.exportExcel(list, "lpzre");
    }

    /**
     * 获取4.4退费查询详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:lpzre:query')")
    @GetMapping(value = "/{chargRegId}")
    public AjaxResult getInfo(@PathVariable("chargRegId") String chargRegId) {
        return AjaxResult.success(refundquery1LpzreService.selectRefundquery1LpzreById(chargRegId));
    }

    /**
     * 新增4.4退费查询
     */
    @PreAuthorize("@ss.hasPermi('system:lpzre:add')")
    @Log(title = "4.4退费查询", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Refundquery1Lpzre refundquery1Lpzre)
    {
        return toAjax(refundquery1LpzreService.insertRefundquery1Lpzre(refundquery1Lpzre));
    }

    /**
     * 修改4.4退费查询
     */
    @PreAuthorize("@ss.hasPermi('system:lpzre:edit')")
    @Log(title = "4.4退费查询", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Refundquery1Lpzre refundquery1Lpzre)
    {
        return toAjax(refundquery1LpzreService.updateRefundquery1Lpzre(refundquery1Lpzre));
    }

    /**
     * 删除4.4退费查询
     */
    @PreAuthorize("@ss.hasPermi('system:lpzre:remove')")
    @Log(title = "4.4退费查询", businessType = BusinessType.DELETE)
	@DeleteMapping("/{chargRegIds}")
    public AjaxResult remove(@PathVariable String[] chargRegIds) {
        return toAjax(refundquery1LpzreService.deleteRefundquery1LpzreByIds(chargRegIds));
    }




}
