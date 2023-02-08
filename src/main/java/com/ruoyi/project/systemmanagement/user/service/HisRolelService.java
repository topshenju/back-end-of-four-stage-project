package com.ruoyi.project.systemmanagement.user.service;

import com.ruoyi.project.systemmanagement.user.domain.HisRole;
import com.ruoyi.project.systemmanagement.user.domain.HisUser;

import java.util.List;

public interface HisRolelService {
    List<HisRole> getAll();

    HisRole roleGetById(Long rolelId);
}
