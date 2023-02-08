package com.ruoyi.project.chargemanagement.prescriptioncharge.controller;

import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.chargemanagement.prescriptioncharge.domain.Pres;
import com.ruoyi.project.chargemanagement.prescriptioncharge.service.IPresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/chargemanagement/prescriptioncharge")
public class PresController extends BaseController {
    @Autowired
    private IPresService presService;
    @PreAuthorize("@ss.hasPermi('chargemanagement:prescriptioncharge:list')")
    @GetMapping("/list")
    public TableDataInfo list(Pres pres){
        List<Pres> po = presService.findPo(pres);
        return getDataTable(po);
    }
}
