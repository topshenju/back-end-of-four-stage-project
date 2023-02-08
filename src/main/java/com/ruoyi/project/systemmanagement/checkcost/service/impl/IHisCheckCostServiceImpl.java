package com.ruoyi.project.systemmanagement.checkcost.service.impl;

import com.ruoyi.project.systemmanagement.checkcost.domain.HisCheckCost;
import com.ruoyi.project.systemmanagement.checkcost.mapper.HisCheckCostMapper;
import com.ruoyi.project.systemmanagement.checkcost.service.IHisCheckCostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class IHisCheckCostServiceImpl implements IHisCheckCostService {
    @Autowired
    private HisCheckCostMapper hisCheckCostMapper;

    @Override
    public List<HisCheckCost> serviceCheckList(HisCheckCost hisCheckCost) {
        List<HisCheckCost> list = hisCheckCostMapper.selectCheckLsit(hisCheckCost);
        return list ;
    }

    @Override
    public List<HisCheckCost> getAll() {
        return hisCheckCostMapper.getALL();
    }

    @Override
    public int addHisCheckCost(HisCheckCost hisCheckCost) {
        hisCheckCost.setCreateTime(new Date());
        return hisCheckCostMapper.insertCheck(hisCheckCost);
    }

    @Override
    public HisCheckCost getCheckById(Long checkId) {
        return hisCheckCostMapper.getCheckById(checkId);
    }

    @Override
    public int updateCheck(HisCheckCost hisCheckCost) {
        hisCheckCost.setUpdateTime(new Date());
        return hisCheckCostMapper.updateCheck(hisCheckCost);
    }

    @Override
    public int removeCheck(Long[] checkId) {

        return hisCheckCostMapper.removeCheck(checkId);
    }

}
