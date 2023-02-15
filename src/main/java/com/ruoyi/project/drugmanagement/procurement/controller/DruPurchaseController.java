package com.ruoyi.project.drugmanagement.procurement.controller;

import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.drugmanagement.procurement.domain.DruDrug;
import com.ruoyi.project.drugmanagement.procurement.domain.DruPurchase;
import com.ruoyi.project.drugmanagement.procurement.domain.DruPurchaseDrug;
import com.ruoyi.project.drugmanagement.procurement.service.DruPurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;


/**
 * @author 杨巍
 * @data 2022-2-8 14:24
 **/
@RestController
@RequestMapping("/drugmanagement/procurement")
public class DruPurchaseController extends BaseController {

    @Autowired
    DruPurchaseService druPurchaseService;

    //条件查询
    @PreAuthorize("@ss.hasAnyPermi('drugmanagement:procurement:selectAll')")
    @GetMapping("/selectAll")
    public TableDataInfo selectAll(DruPurchase druPurchase){
        startPage();
        List<DruPurchase> dru= druPurchaseService.selectAll(druPurchase);
        System.out.println(dru);
        return  getDataTable(dru);
    }

    //新增
    @PostMapping("/add")
    @PreAuthorize("@ss.hasPermi('drugmanagement:procurement:add')")
    @Log(title = "添加采购信息", businessType = BusinessType.INSERT)
    public AjaxResult addDruPurchase(@RequestBody DruPurchase druPurchase) {
        druPurchase.setCreateBy(SecurityUtils.getUsername());
        int rows = druPurchaseService.addDruPurchase(druPurchase);
        return toAjax(rows);
    }

    /**
     * 修改
     * @param druPurchase
     * @return
     */
    @PutMapping("/edit")
    @PreAuthorize("@ss.hasPermi('drugmanagement:procurement:edit')")
    @Log(title = "采购信息修改", businessType = BusinessType.UPDATE)
    public AjaxResult editDruPurchase(@RequestBody DruPurchase druPurchase){
        // 设置修改人姓名
        druPurchase.setUpdateBy(SecurityUtils.getUsername());
        int rows = druPurchaseService.updateDruPurchase(druPurchase);
        return toAjax(rows);
    }

    /**
     * 批量删除
     */
    @PreAuthorize("@ss.hasPermi('drugmanagement:procurement:remove')")
    @DeleteMapping("/{procurement_ids}")
    public AjaxResult removeDruPurchases(@PathVariable String[] procurement_ids){
        return toAjax(druPurchaseService.removeDruPurchases(procurement_ids));
    }

    /**
     * 根据ID查询
     */
    @GetMapping("/selectById/{procurement_id}")
    @PreAuthorize("@ss.hasPermi('drugmanagement:procurement:selectById')")
    public AjaxResult getById(@PathVariable String procurement_id){
        DruPurchase druPurchase=druPurchaseService.getById(procurement_id);
        return AjaxResult.success(druPurchase.getApplyUser());
    }

    /**
     * 查询供应商
     */
    @GetMapping("/selectSupplier")
    @PreAuthorize("@ss.hasPermi('drugmanagement:procurement:querySupplier')")
    public AjaxResult selectSupplier(){
        List<DruPurchase> druPurchases = druPurchaseService.selectSupplier();
        return AjaxResult.success(druPurchases);
    }

    /**
     * 根据采购单号查询采购单详情信息
     *
     * @param dpid  采购单号
     * @return  返回携带采购订单信息和采购的药品信息集合
     */
    @PreAuthorize("@ss.hasAnyPermi('drug:purchase:selectAll')")
    @GetMapping("/selectParticulars/{dpid}")
    public AjaxResult selectParticulars(@PathVariable String dpid) {

        Map<String, Object> map = druPurchaseService.selectParticulars(dpid);

        return AjaxResult.success(map);
    }


    /**

     - 提交审核
     */
    @PutMapping("/edit/{procurement_ids}/{state}")
    @PreAuthorize("@ss.hasPermi('drugmanagement:procurement:edit')")
    @Log(title = "采购信息修改", businessType = BusinessType.UPDATE)
    public AjaxResult editDruPurchase(@PathVariable("procurement_ids") String[] procurement_ids,@PathVariable("state")int state){
        // 设置修改人姓名
        // druPurchase.setUpdateBy(SecurityUtils.getUsername());
        int rows = druPurchaseService.updateDruPurchase(procurement_ids,state);
        return toAjax(rows);
    }

    /**
     * 暂存
     *
     * @param druPurchase  采购单数据
     * @return 成功返回1
     */
    @PreAuthorize("@ss.hasAnyPermi('drug:purchase:update')")
    @PutMapping("/updatepurchase")
    public AjaxResult updatepurchase(@RequestBody DruPurchase druPurchase) {

        druPurchase.setUpdateBy(SecurityUtils.getUsername());
        druPurchase.setUpdateTime(new Date());

        return toAjax(druPurchaseService.updatepurchase(druPurchase));
    }

    /**
     * 保存
     *
     * @param
     * @return  成功返回1
     */
    @PutMapping ("/addDrugAndRelation")
    public AjaxResult addDrugAndRelation(@RequestBody List<DruPurchaseDrug> druPurchaseDrugs) {
        druPurchaseDrugs.forEach(System.out::println);
        int i=druPurchaseService.add(druPurchaseDrugs);

        return toAjax(i);
    }

}
