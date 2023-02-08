package com.ruoyi.project.systemmanagement.checkcost.service;

import com.ruoyi.project.systemmanagement.checkcost.domain.HisCheckCost;

import java.util.List;

public interface IHisCheckCostService {
    //查询
    List<HisCheckCost> serviceCheckList(HisCheckCost hisCheckCost);

    //查询所有
    List<HisCheckCost> getAll();

    //添加
    int addHisCheckCost(HisCheckCost hisCheckCost);
    //修改查询
    HisCheckCost getCheckById(Long checkId);

    int updateCheck(HisCheckCost hisCheckCost);

    int removeCheck(Long[] checkId);
}
