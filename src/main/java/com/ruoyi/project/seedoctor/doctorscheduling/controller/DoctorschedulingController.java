package com.ruoyi.project.seedoctor.doctorscheduling.controller;

import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.seedoctor.doctorscheduling.domain.Doctorscheduling;
import com.ruoyi.project.seedoctor.doctorscheduling.domain.Scheduling;
import com.ruoyi.project.seedoctor.doctorscheduling.service.DoctorschedulingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author simba@onlying.cn
 * @date 2021/7/14 19:04
 */
@RequestMapping("/seedoctor/doctorscheduling")
@RestController
public class DoctorschedulingController extends BaseController {

    @Autowired
    private DoctorschedulingService doctorschedulingService;

    //查询 所有 医生 和 科室
    @GetMapping("/list")
    public AjaxResult getDoctors(){
        return AjaxResult.success(doctorschedulingService.getDoctorsAll());
    }

    //查询 所有医生排班
    @GetMapping("/doctor")
    @PreAuthorize("@ss.hasPermi('seedoctor:doctorscheduling:query')")
    public TableDataInfo geDtAllclass(Doctorscheduling doctorscheduling){
        //分页相关
        startPage();
        //调用service 查询数据库
        List<Scheduling> list = doctorschedulingService.findAll(doctorscheduling);
        //返回结果

        return getDataTable(list);
    }

    //查询 单个排班详情
    @GetMapping(value = "/{sche_id}")
    @PreAuthorize("@ss.hasPermi('seedoctor:doctorscheduling:query')")
    public AjaxResult getfindOne(@PathVariable Integer sche_id){
        Scheduling scheduling =  doctorschedulingService.getfindOne(sche_id);
        return AjaxResult.success(scheduling);
    }
}
