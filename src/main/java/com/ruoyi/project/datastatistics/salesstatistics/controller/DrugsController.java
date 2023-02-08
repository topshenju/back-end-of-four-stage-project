package com.ruoyi.project.datastatistics.salesstatistics.controller;

import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.datastatistics.salesstatistics.domain.Drugs;
import com.ruoyi.project.datastatistics.salesstatistics.service.DrugsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author Administrator
 * @Date 2021/7/14 16:49
 * @Version 1.0
 */
@RestController
@RequestMapping("/salesstatistics/drug")
public class DrugsController extends BaseController {
    @Autowired
    private DrugsService drugsService;

    @GetMapping("/More")
    @PreAuthorize("@ss.hasPermi('system:salesstatistics:query')")
    public TableDataInfo Sdrug(Drugs drugs){
        System.out.println("进入控制单元模块");
        System.out.println(drugs);
        List<Drugs> drug = drugsService.selectDrug(drugs);
        System.out.println(drugs);
        return getDataTable(drug);
    }
}
