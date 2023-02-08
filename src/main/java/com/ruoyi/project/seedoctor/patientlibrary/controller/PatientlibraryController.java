package com.ruoyi.project.seedoctor.patientlibrary.controller;

import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.seedoctor.patientlibrary.domain.Patientlibrary;
import com.ruoyi.project.seedoctor.patientlibrary.service.PatientlibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author simba@onlying.cn
 * @date 2021/7/13 15:40
 */
@RestController
@RequestMapping("/seedoctor/patientlibrary")
public class PatientlibraryController extends BaseController {

    @Autowired
    private PatientlibraryService patientlibraryService;

    //患者查询
    @GetMapping("/list")
    @PreAuthorize("@ss.hasPermi('seedoctor:patientlibrary:query')")
    public TableDataInfo list(Patientlibrary patientlibrary){
        //分页相关,处理请求参数pageNum，pageSize等。并使用PageHelper处理分页查询
        startPage();

        //调用service 查询数据库
        List<Patientlibrary> list = patientlibraryService.selectList(patientlibrary);
        //返回
        return getDataTable(list);
    }


}
