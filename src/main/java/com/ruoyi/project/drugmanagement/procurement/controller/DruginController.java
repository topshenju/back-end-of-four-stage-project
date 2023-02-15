package com.ruoyi.project.drugmanagement.procurement.controller;


import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.drugmanagement.procurement.domain.DruDrug;
import com.ruoyi.project.drugmanagement.procurement.service.DruinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
@Transactional
@RequestMapping("/drugmanagement/drugin")
public class DruginController extends BaseController {

    @Autowired
    private DruinService druDrugService;
    /**
     * 查询所有的药品类型
     *
     * @return  返回查询结果集合
     */
    @PreAuthorize("@ss.hasAnyPermi('drug:drugin:selectAll')")
    @GetMapping("/selectDdType")
    public TableDataInfo selectDdType() {
        List<DruDrug> list = druDrugService.selectDdType();
        return getDataTable(list);
    }

    /**
     * 查询所有的处方类型
     *
     * @return  返回查询结果集合
     */
    @PreAuthorize("@ss.hasAnyPermi('drug:drugInformation:selectAll')")
    @GetMapping("/selectPrescriptionType")
    public TableDataInfo selectPrescriptionType() {
        List<DruDrug> list = druDrugService.selectPrescriptionType();
        return getDataTable(list);
    }

    /**
     * 根据条件进行数据的查询
     *
     * @param druDrug  用于传查询条件
     * @return  返回查询结果集合
     */
    @PreAuthorize("@ss.hasAnyPermi('drug:drugInformation:selectAll')")
    @GetMapping("/selectAll")
    public TableDataInfo selectAll(DruDrug druDrug) {
        startPage();
        List<DruDrug> list = druDrugService.selectAll(druDrug);
        return getDataTable(list);
    }

    /**
     * 新增药品信息
     *
     * @param druDrug  用来传递药品信息数据
     * @return  返回 1 成功  否则失败
     */
    @PreAuthorize("@ss.hasAnyPermi('drug:drugInformation:addDrug')")
    @PostMapping("/addDrug")
    public AjaxResult addDrug(@RequestBody DruDrug druDrug) {
        String username = SecurityUtils.getUsername();
        druDrug.setCreateBy(username);
        druDrug.setCreateTime(new Date());
        return toAjax(druDrugService.addDrug(druDrug));
    }

    /**
     * 根据主键查询单条药品信息
     *
     * @return  返回查询到的药品信息对象
     */
    @PreAuthorize("@ss.hasAnyPermi('drug:drugInformation:updateDrug')")
    @GetMapping("/selectOne")
    public AjaxResult selectOne(int ddid) {
        DruDrug druDrug = druDrugService.selectOne(ddid);
        return AjaxResult.success(druDrug);
    }

    /**
     * 修改药品信息
     *
     * @param druDrug  用来传递药品信息数据
     * @return   返回 1 成功  否则失败
     */
    @PreAuthorize("@ss.hasAnyPermi('drug:drugInformation:updateDrug')")
    @PutMapping("/updateDrug")
    public AjaxResult updateDrug(@RequestBody DruDrug druDrug) {
        druDrug.setUpdateBy(SecurityUtils.getUsername());
        druDrug.setUpdateTime(new Date());
        return toAjax(druDrugService.updateDrug(druDrug));
    }

    /**
     * 根据主键删除单条或多条药品信息
     *
     * @param ddids  药品信息主键的数组
     * @return    返回 1 成功  否则失败
     */
    @PreAuthorize("@ss.hasAnyPermi('drug:drugInformation:deleteDrug')")
    @DeleteMapping("/deleteDrug/{ddids}")
    public AjaxResult deleteDrug(@PathVariable int[] ddids) {
        System.err.println(Arrays.toString(ddids));
        return toAjax(druDrugService.deleteDrug(ddids));
    }
}
