package com.ruoyi.project.seedoctor.registrationlist.controller;

import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.seedoctor.registrationlist.domain.RegList;
import com.ruoyi.project.seedoctor.registrationlist.service.RegistrationListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @Author Ada
 * @Date 2021/7/15 21:23
 */
@RestController
@RequestMapping("/system/registrationlist")
public class RegistrationListController extends BaseController {

    @Autowired
    private RegistrationListService registrationListService;

    @GetMapping("/list")
    @PreAuthorize("@ss.hasPermi('system:registrationlist:query')")
    public TableDataInfo regList(RegList regList) {
        System.out.println("进入挂号列表查询模块");
        System.out.println(regList);
        List<RegList> more = registrationListService.findMore(regList);
        System.out.println(more);
        return getDataTable(more);
    }

    @GetMapping("/type")
    public AjaxResult getType() {
        System.out.println("进入挂号类型控制单元");
        List<RegList> type = registrationListService.findType();
        System.out.println(type);
        return AjaxResult.success(type);
    }

    @GetMapping("/period")
    public AjaxResult getPeriod() {
        System.out.println("进入挂号时段控制单元");
        List<RegList> period = registrationListService.findPeriod();
        System.out.println(period);
        return AjaxResult.success(period);
    }

    @GetMapping("/status")
    public AjaxResult getStatus() {
        System.out.println("进入挂号状态控制单元");
        List<RegList> status = registrationListService.findStatus();
        return AjaxResult.success(status);
    }

    @GetMapping("/image")
    public void getImage(String imageName, HttpServletResponse response) {
        System.out.println("进入图片回显模块");
        byte[] datas = registrationListService.getImage(imageName);
        File file = new File("E:/yjd.png");
        System.out.println(file.exists());

        if (datas != null) {
            try {
                response.setContentType("application/octet-stream");
                response.getOutputStream().write(datas, 0, datas.length);
                response.getOutputStream().flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
