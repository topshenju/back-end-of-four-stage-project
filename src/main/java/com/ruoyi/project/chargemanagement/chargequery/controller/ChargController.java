package com.ruoyi.project.chargemanagement.chargequery.controller;

import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.chargemanagement.chargequery.domain.Charg;
import com.ruoyi.project.chargemanagement.chargequery.service.IChargService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/chargemanagement/chargequery")
public class ChargController extends BaseController {
    @Autowired
    private IChargService chargService;


    @PreAuthorize("@ss.hasPermi('chargemanagement:chargequery:list')")
    @GetMapping("/list")
    public TableDataInfo list(Charg charg) {
        //调用  分页
        startPage();

        List<Charg> list = chargService.selectChargList(charg);
        return getDataTable(list);
    }

}
