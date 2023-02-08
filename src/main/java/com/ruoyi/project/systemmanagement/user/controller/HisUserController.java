package com.ruoyi.project.systemmanagement.user.controller;

import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.systemmanagement.user.domain.HisRole;
import com.ruoyi.project.systemmanagement.user.domain.HisUser;
import com.ruoyi.project.systemmanagement.user.service.HisRolelService;
import com.ruoyi.project.systemmanagement.user.service.HisUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/system/userSys")
@RestController
public class HisUserController extends BaseController {
    @Autowired
    private HisUserService hisUserService;

    @Autowired
    private HisRolelService hisRolelService;

    /*查询所有角色*/
    @GetMapping("/all")
    public AjaxResult getAll() {
        return AjaxResult.success(hisRolelService.getAll());
    }

    /*删除*/
    @DeleteMapping("/{userId}")
    @PreAuthorize("@ss.hasPermi('system:userSys:remove')")
    public AjaxResult removeHisUser(@PathVariable Long[] userId ) {
        return toAjax(hisUserService.removeHisUser(userId));
    }


    /*修改*/
    @PutMapping
    @PreAuthorize("@ss.hasPermi('system:userSys:edit')")
    public AjaxResult editHisUser(@RequestBody HisUser hisUser) {
        System.out.println(hisUser);
        hisUser.setUpdateBy(SecurityUtils.getUsername());
        int rows = hisUserService.updateHisUser(hisUser);
        return toAjax(rows);
    }


    /*修改查询*/
    @GetMapping("/{userId}")
    public AjaxResult getById(@PathVariable Long userId) {
        HisUser user = hisUserService.getReGistRationFee(userId);
        return AjaxResult.success(user);
    }

    /*新增*/
    @PostMapping
    @PreAuthorize("@ss.hasPermi('system:userSys:add')")
    public AjaxResult insertUser(@RequestBody HisUser hisUser) {
        hisUser.setCreateBy(SecurityUtils.getUsername());
        int rows = hisUserService.insertUserService(hisUser);
        return toAjax(rows);
    }



    /*查询*/
    @PreAuthorize("@ss.hasPermi('system:hisuser:index')")
    @GetMapping("/listSys")
    public TableDataInfo ListRe(HisUser hisUser) {
        startPage();
        List<HisUser> list = hisUserService.serviceHisUser(hisUser);
        return getDataTable(list);

    }
}
