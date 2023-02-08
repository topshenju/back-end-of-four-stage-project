package com.ruoyi.project.systemmanagement.user.service;

import com.ruoyi.project.systemmanagement.user.domain.HisRole;
import com.ruoyi.project.systemmanagement.user.domain.HisUser;

import java.util.List;

public interface HisUserService {
    List<HisUser> serviceHisUser(HisUser hisUser);

    int insertUserService(HisUser hisUser);

    HisUser getReGistRationFee(Long userId);

    int updateHisUser(HisUser hisUser);

    int removeHisUser(Long[] userId);



}
