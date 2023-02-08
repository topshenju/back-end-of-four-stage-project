package com.ruoyi.project.systemmanagement.user.mapper;

import com.ruoyi.project.systemmanagement.user.domain.HisRole;
import com.ruoyi.project.systemmanagement.user.domain.HisUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface HisRolelMapper {
    List<HisRole> RoleGetAll();


    HisRole roleGetById(Long rolelId);
}
