package com.ruoyi.project.systemmanagement.registrationfee.controller;

import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.systemmanagement.checkcost.domain.HisCheckCost;
import com.ruoyi.project.systemmanagement.registrationfee.domain.ReGistRationFee;
import com.ruoyi.project.systemmanagement.registrationfee.service.ReGistRationFeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/system/registrationfee")
public class ReGistRationFeeController extends BaseController {
    @Autowired
    private ReGistRationFeeService reGistRationFeeService;


     /*删除*/
     @DeleteMapping("/{regisId}")
     @PreAuthorize("@ss.hasPermi('system:registrationfee:remove')")
     public AjaxResult removeCheck(@PathVariable Long[] regisId ) {
         return toAjax(reGistRationFeeService.removeReGistRationFee(regisId));
     }


     /*修改*/
     @PutMapping
     @PreAuthorize("@ss.hasPermi('system:registrationfee:edit')")
     public AjaxResult editReGistRationFee(@RequestBody ReGistRationFee reGistRationFee) {
         reGistRationFee.setUpdateBy(SecurityUtils.getUsername());
         int rows = reGistRationFeeService.updateReGistRationFee(reGistRationFee);
         return toAjax(rows);
     }

    /*修改查询*/
    @GetMapping("/{regisId}")
    @PreAuthorize("@ss.hasPermi('system:registrationfee:index')")
    public AjaxResult getById(@PathVariable Long regisId) {
        ReGistRationFee regis = reGistRationFeeService.getReGistRationFee(regisId);
        return AjaxResult.success(regis);
    }




    /*新增*/
    @PreAuthorize("@ss.hasPermi('system:registrationfee:add')")
    @PostMapping
    public AjaxResult addRegGisRationGee(@RequestBody ReGistRationFee reGistRationFee) {
        reGistRationFee.setCreateBy(SecurityUtils.getUsername());
        int rows=reGistRationFeeService.serviceReAdd(reGistRationFee);
        return toAjax(rows);
    }
    /*查询*/
    @PreAuthorize("@ss.hasPermi('system:registrationfee:index')")
    @GetMapping("/listRe")
    public TableDataInfo ListRe(ReGistRationFee reGistRationFee) {
        startPage();
        List<ReGistRationFee> list = reGistRationFeeService.serviceReGistRationFee(reGistRationFee);
        return getDataTable(list);
    }

}
