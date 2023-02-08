package com.ruoyi.project.drugmanagement.druginformation.service.impl;

import com.ruoyi.project.drugmanagement.druginformation.domain.Druginformation;
import com.ruoyi.project.drugmanagement.druginformation.domain.TypeMedicine;
import com.ruoyi.project.drugmanagement.druginformation.domain.TypePrescription;
import com.ruoyi.project.drugmanagement.druginformation.mapper.DruginformationMapper;
import com.ruoyi.project.drugmanagement.druginformation.service.DruginformationService;
import com.ruoyi.project.drugmanagement.manufacturer.domain.Manufacturer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author vincent
 * @data 2021-7-15 13:59
 **/
@Service
public class DruginformationServiceImpl implements DruginformationService {
    @Autowired
    private DruginformationMapper druginformationMapper;

    /**
     * 查询
     * @param druginformation
     * @return
     */
    @Override
    public List<Druginformation> selectList(Druginformation druginformation) {
        return druginformationMapper.selectList(druginformation);
    }

    /**
     * 新增
     * @param druginformation
     * @return
     */
    @Override
    public int addDrugInformation(Druginformation druginformation) {
        druginformation.setCreateTime(new Date());
        return druginformationMapper.insert(druginformation);
    }

    /**
     * 根据主键查询
     * @param maintenanceId
     * @return
     */
    @Override
    public Druginformation getById(Long maintenanceId) {
        return druginformationMapper.selectById(maintenanceId);
    }

    /**
     * 跟新
     * @param druginformation
     * @return
     */
    @Override
    public int updateDrugInformation(Druginformation druginformation) {
        druginformation.setUpdateTime(new Date());
        return druginformationMapper.update(druginformation);
    }

    /**
     * 批量删除
     * @param maintenanceIds
     * @return
     */
    @Override
    public int removeDrugInformation(Long[] maintenanceIds) {
        return druginformationMapper.batchDelete(maintenanceIds);
    }

    @Override
    public List<Manufacturer> getAll() {
        return druginformationMapper.selectAllManufacturer();
    }

    @Override
    public List<TypeMedicine> getAllMedicine() {
        return druginformationMapper.selectAllMedicine();
    }

    @Override
    public List<TypePrescription> getAllPrescription() {
        return druginformationMapper.selectAllPrescription();
    }
}
