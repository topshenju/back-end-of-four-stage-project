package com.ruoyi.project.checkmanagement.resultentry.controller;

import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.checkmanagement.resultentry.domin.Resultentry;
import com.ruoyi.project.checkmanagement.resultentry.service.IResultentryService;
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
@RequestMapping("/system/resultentry")
public class ResultentryController extends BaseController {

    @Autowired
    private IResultentryService iResultentryService;

    @PreAuthorize("@ss.hasPermi('system:resultentry:list')")
    @GetMapping("/list")
    public TableDataInfo list(Resultentry resultentry){
        List<Resultentry> list = iResultentryService.findAll(resultentry);

        return getDataTable(list);
    }
}
