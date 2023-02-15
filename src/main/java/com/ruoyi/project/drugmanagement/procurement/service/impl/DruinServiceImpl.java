package com.ruoyi.project.drugmanagement.procurement.service.impl;

import com.ruoyi.project.drugmanagement.procurement.domain.DruDrug;
import com.ruoyi.project.drugmanagement.procurement.mapper.DruPurchaseDrugMapper;
import com.ruoyi.project.drugmanagement.procurement.mapper.DruinMapper;
import com.ruoyi.project.drugmanagement.procurement.service.DruinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DruinServiceImpl implements DruinService {

    @Autowired
    DruinMapper druinMapper;

    @Override
    public List<DruDrug> selectDdType() {
        return druinMapper.selectDdType();
    }

    @Override
    public List<DruDrug> selectPrescriptionType() {
        return druinMapper.selectPrescriptionType();
    }

    @Override
    public List<DruDrug> selectAll(DruDrug druDrug) {
        return druinMapper.selectList(druDrug);
    }

    @Override
    public int addDrug(DruDrug druDrug) {
        return 0;
    }

    @Override
    public DruDrug selectOne(int ddid) {
        return null;
    }

    @Override
    public int updateDrug(DruDrug druDrug) {
        return 0;
    }

    @Override
    public int deleteDrug(int[] ddids) {
        return 0;
    }
}
