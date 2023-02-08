package com.ruoyi.project.seedoctor.outpatientservice.controller;

import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.seedoctor.outpatientservice.domain.Charge;
import com.ruoyi.project.seedoctor.outpatientservice.domain.Registered;
import com.ruoyi.project.seedoctor.outpatientservice.service.OutpatientService;
import com.ruoyi.project.seedoctor.registrationlist.domain.RegList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author Ada
 * @Date 2021/7/15 9:48
 */
@RestController
@RequestMapping("/system/outpatientservice")
public class OutpatientServiceController extends BaseController {

    @Autowired
    private OutpatientService outpatientService;

    @GetMapping("/id")
    @PreAuthorize("@ss.hasPermi('system:outpatientservice:getId')")
    public AjaxResult getId(Registered registered) {
        String idNumber = registered.getIdNumber();
        if (idNumber != null) {
            Registered reg = outpatientService.findId(idNumber);
            return AjaxResult.success(reg);
        }
        return null;
    }

    @GetMapping("/info")
    @PreAuthorize("@ss.hasPermi('system:outpatientservice:info')")
    public TableDataInfo getInfo(Registered registered) {
        System.out.println("reg:" + registered);
        String idNumber = registered.getIdNumber();
        if (idNumber != null && !(idNumber.equals("")) ){
            List<Registered> one = outpatientService.findOne(registered);
            System.out.println(one);
            return getDataTable(one);
        }
        return null;
    }

    @GetMapping("/list")
    @PreAuthorize("@ss.hasPermi('system:outpatientservice:query')")
    public TableDataInfo getList(Charge charge) {
        List<Charge> more = outpatientService.findMore(charge);
        System.out.println(more);
        return getDataTable(more);
    }

    @GetMapping("/charge")
    public AjaxResult getCharge(Charge charge) {
        System.out.println("charge" + charge);
        return toAjax(1);
    }

    @GetMapping("/type")
    public AjaxResult getType() {
        List<Charge> type = outpatientService.findType();
        System.out.println("类型");
        System.out.println(type);
        return AjaxResult.success(type);
    }

    @GetMapping("/period")
    public AjaxResult getPeriod() {
        List<Charge> period = outpatientService.findPeriod();
        System.out.println("时段");
        System.out.println(period);
        return AjaxResult.success(period);
    }



}
