package com.ruoyi.project.checkmanagement.resultquery.controller;

import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.checkmanagement.resultentry.domin.Resultentry;
import com.ruoyi.project.checkmanagement.resultentry.service.IResultentryService;
import com.ruoyi.project.checkmanagement.resultquery.domin.Resultquery;
import com.ruoyi.project.checkmanagement.resultquery.service.IResultqueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author yhb
 * @Date 2021/7/14 8:46
 */
@RestController
@RequestMapping("/system/resultquery")
public class ResultqueryController extends BaseController {

    @Autowired
    private IResultqueryService iResultqueryService;

    @PreAuthorize("@ss.hasPermi('system:resultquery:list')")
    @GetMapping("/list")
    public TableDataInfo list(Resultquery resultquery){
        List<Resultquery> list = iResultqueryService.findAll(resultquery);

        return getDataTable(list);
    }
}
