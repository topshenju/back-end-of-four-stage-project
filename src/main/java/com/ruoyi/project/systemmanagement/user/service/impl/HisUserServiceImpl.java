package com.ruoyi.project.systemmanagement.user.service.impl;

import com.ruoyi.project.systemmanagement.user.domain.HisRole;
import com.ruoyi.project.systemmanagement.user.domain.HisUser;
import com.ruoyi.project.systemmanagement.user.mapper.HisRolelMapper;
import com.ruoyi.project.systemmanagement.user.mapper.HisUserMapper;
import com.ruoyi.project.systemmanagement.user.service.HisUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class HisUserServiceImpl implements HisUserService {
    @Autowired
    private HisUserMapper hisUserMapper;



    @Override
    public List<HisUser> serviceHisUser(HisUser hisUser) {

        return hisUserMapper.hisListUser(hisUser);

    }

    @Override
    public int insertUserService(HisUser hisUser) {
        hisUser.setCreateTime(new Date());
        return hisUserMapper.insertUserMapper(hisUser);
    }

    @Override
    public HisUser getReGistRationFee(Long userId) {
        return hisUserMapper.UserGetAll(userId);
    }

    @Override
    public int updateHisUser(HisUser hisUser) {
        hisUser.setUpdateTime(new Date());
        return hisUserMapper.updateHisUser(hisUser);

    }

    @Override
    public int removeHisUser(Long[] userId) {
        return hisUserMapper.removeHisUser(userId);
    }



}
