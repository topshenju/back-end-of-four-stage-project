package com.ruoyi.project.chargemanagement.refundquery.controller;

import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.BaseEntity;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.chargemanagement.refundquery.domain.Ref;
import com.ruoyi.project.chargemanagement.refundquery.service.IRefService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/chargemanagement/refundquery")
public class RefController extends BaseController {

    @Autowired
    private IRefService refService;

    @PreAuthorize("@ss.hasPermi('chargemanagement:refundquery:list')")
    @GetMapping("/list")
    public TableDataInfo list(Ref ref){
        startPage();
        List<Ref> list = refService.FindMoer(ref);
        return getDataTable(list);
    }
}
