package com.ruoyi.project.systemmanagement.registrationfee.service.impl;

import com.ruoyi.project.systemmanagement.checkcost.domain.HisCheckCost;
import com.ruoyi.project.systemmanagement.registrationfee.domain.ReGistRationFee;
import com.ruoyi.project.systemmanagement.registrationfee.mapper.ReGistRationFeeMapper;
import com.ruoyi.project.systemmanagement.registrationfee.service.ReGistRationFeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ReGistRationFeeServiceImpl implements ReGistRationFeeService {
    @Autowired
    private ReGistRationFeeMapper reGistRationFeeMapper;
    @Override
    public List<ReGistRationFee> serviceReGistRationFee(ReGistRationFee reGistRationFee) {
        List<ReGistRationFee>list= reGistRationFeeMapper.ReGistRationFeeLList(reGistRationFee);
        return list;
    }

    @Override
    public int serviceReAdd(ReGistRationFee reGistRationFee) {

        reGistRationFee.setCreateTime(new Date());
        int rows=reGistRationFeeMapper.reGistRationAdd(reGistRationFee);
        return rows;
    }

    @Override
    public  ReGistRationFee getReGistRationFee(Long regisId) {
        ReGistRationFee getAll=  reGistRationFeeMapper.getReGist(regisId);
        return getAll;
    }

    @Override
    public int updateReGistRationFee(ReGistRationFee reGistRationFee) {
        reGistRationFee.setUpdateTime(new Date());
        int rows=reGistRationFeeMapper.reGistRationupdate(reGistRationFee);
        return rows;
    }

    @Override
    public int removeReGistRationFee(Long[] regisId) {
        return reGistRationFeeMapper.reGistRationRemove(regisId);
    }
}
