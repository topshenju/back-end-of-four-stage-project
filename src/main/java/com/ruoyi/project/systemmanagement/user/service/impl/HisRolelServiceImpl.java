package com.ruoyi.project.systemmanagement.user.service.impl;

import com.ruoyi.project.systemmanagement.user.domain.HisRole;

import com.ruoyi.project.systemmanagement.user.mapper.HisRolelMapper;
import com.ruoyi.project.systemmanagement.user.service.HisRolelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HisRolelServiceImpl implements HisRolelService {
    @Autowired
    private HisRolelMapper hisRolelMapper;
    @Override
    public List<HisRole> getAll() {
        return hisRolelMapper.RoleGetAll();
    }

    @Override
    public HisRole roleGetById(Long rolelId) {
        return hisRolelMapper.roleGetById(rolelId);
    }
}
