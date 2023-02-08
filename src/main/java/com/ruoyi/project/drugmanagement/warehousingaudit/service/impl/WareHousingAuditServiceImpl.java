package com.ruoyi.project.drugmanagement.warehousingaudit.service.impl;

import com.ruoyi.project.drugmanagement.warehousingaudit.domain.Drug;
import com.ruoyi.project.drugmanagement.warehousingaudit.mapper.WareHousingAuditMapper;
import com.ruoyi.project.drugmanagement.warehousingaudit.service.WareHousingAuditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Ada
 * @Date 2021/7/13 20:16
 */
@Service
public class WareHousingAuditServiceImpl implements WareHousingAuditService {

    @Autowired
    private WareHousingAuditMapper wareHousingAuditMapper;

    @Override
    public List<Drug> findMore(Drug drug) {
        System.out.println("进入service模块");
        List<Drug> drugs = wareHousingAuditMapper.selectMore(drug);
        return drugs;
    }

    @Override
    public int changeOne(int documentsId) {
        return wareHousingAuditMapper.updateOne(documentsId);

    }

    @Override
    public int change(int documentsId) {
        return wareHousingAuditMapper.update(documentsId);
    }

}
