package com.ruoyi.project.systemmanagement.user.controller;

import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.project.systemmanagement.user.domain.HisRole;
import com.ruoyi.project.systemmanagement.user.domain.HisUser;
import com.ruoyi.project.systemmanagement.user.service.HisRolelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/system/userSysll")
@RestController
public class HisRoleController {
    @Autowired
    private HisRolelService hisRolelService;

    @GetMapping("/{rolelId}")
    public AjaxResult roleGetById(@PathVariable Long rolelId) {
        HisRole role = hisRolelService.roleGetById(rolelId);
        return AjaxResult.success(role);
    }
}
