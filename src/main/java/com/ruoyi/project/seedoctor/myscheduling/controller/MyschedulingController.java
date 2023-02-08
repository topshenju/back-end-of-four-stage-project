package com.ruoyi.project.seedoctor.myscheduling.controller;

import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.project.seedoctor.doctorscheduling.domain.Scheduling;
import com.ruoyi.project.seedoctor.myscheduling.domain.Scheduling2;
import com.ruoyi.project.seedoctor.myscheduling.service.MyschedulingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author simba@onlying.cn
 * @date 2021/7/16 15:46
 */
@RestController
@RequestMapping("/seedoctor/myscheduling")
public class MyschedulingController {

    @Autowired
    private MyschedulingService myschedulingService;

    @GetMapping("/list")
    @PreAuthorize("@ss.hasPermi('seedoctor:myscheduling:query')")
    public AjaxResult getMyschedu(){
        List<Scheduling2> scheduling2 = myschedulingService.findOne();
        return AjaxResult.success(scheduling2)
                ;
    }

}
