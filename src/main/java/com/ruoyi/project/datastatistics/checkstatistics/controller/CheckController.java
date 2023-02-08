package com.ruoyi.project.datastatistics.checkstatistics.controller;

import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.datastatistics.checkstatistics.domain.Check;
import com.ruoyi.project.datastatistics.checkstatistics.service.CheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * @Author Administrator
 * @Date 2021/7/15 8:47
 * @Version 1.0
 */
@RestController
@RequestMapping("/checkstatistics/check")
public class CheckController extends BaseController {
    @Autowired
    private CheckService checkService;
    @GetMapping("/More")
    @PreAuthorize("@ss.hasPermi('system:checkstatistics:query')")
    public TableDataInfo findC(Check check){
        List<Check> check1 = checkService.findCheck(check);
        return getDataTable(check1);

    }
}
