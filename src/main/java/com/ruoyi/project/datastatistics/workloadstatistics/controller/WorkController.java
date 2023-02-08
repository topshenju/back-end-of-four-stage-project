package com.ruoyi.project.datastatistics.workloadstatistics.controller;

import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.datastatistics.workloadstatistics.domain.Work;
import com.ruoyi.project.datastatistics.workloadstatistics.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.method.P;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @Author Administrator
 * @Date 2021/7/14 20:12
 * @Version 1.0
 */
@RestController
@RequestMapping("/workloadstatistics/work")
public class WorkController extends BaseController {
    @Autowired
    private WorkService workService;
//查询
    @GetMapping("/More")
    @PreAuthorize("@ss.hasPermi('system:workloadstatistics:query')")
    public TableDataInfo findw(Work work) {
        System.out.println(work);
        List<Work> Wk = workService.findWork(work);
        System.out.println(Wk);
        return getDataTable(Wk);
    }
// 修改
    @PutMapping
    @PreAuthorize("@ss.hasPermi('system:workloadstatistics:edit')")
    public AjaxResult xiugai(@RequestBody Work work) {
        System.out.println("进入修改单元");
        System.out.println(work);
        work.setUpdateBy(SecurityUtils.getUsername());
        int rows= workService.xiugai(work);
        return toAjax(rows);

    }
//主键查询
    @GetMapping("/{registerId}")
    @PreAuthorize("@ss.hasPermi('system:workloadstatistics:query')")
    public AjaxResult getBId (@PathVariable Integer registerId ){
      Work  w=workService.getId(registerId);
        System.out.println(w);
      return AjaxResult.success(w);
    }
//    添加
    @PostMapping
    @PreAuthorize("@ss.hasPermi('system:workloadstatistics:add')")
    public AjaxResult addWork(@RequestBody Work work){
      work.setCreateBy(SecurityUtils.getUsername());
        int rows = workService.insertWork(work);
        return toAjax(rows);

    }
//删除
    @DeleteMapping("/{registerIds}")
    @PreAuthorize("@ss.hasPermi('system:workloadstatistics:remove')")
    public AjaxResult delete(@PathVariable Integer[] registerIds){
        System.out.println("进入控制器");
        System.out.println(Arrays.toString(registerIds));
        int i = workService.deleteWork(registerIds);
        return AjaxResult.success(i);
    }

}