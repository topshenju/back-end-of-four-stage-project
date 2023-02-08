package com.ruoyi.project.drugmanagement.druginformation.service;

import com.ruoyi.project.drugmanagement.druginformation.domain.Druginformation;
import com.ruoyi.project.drugmanagement.druginformation.domain.TypeMedicine;
import com.ruoyi.project.drugmanagement.druginformation.domain.TypePrescription;
import com.ruoyi.project.drugmanagement.manufacturer.domain.Manufacturer;

import java.util.List;

/**
 * @author vincent
 * @data 2021-7-15 13:58
 **/
public interface DruginformationService {
    /**
     * 根据查询条件，访问数据库，查询厂家
     * 分页逻辑使用PageHelper实现。
     * @param druginformation
     * @return
     */
    List<Druginformation> selectList(Druginformation druginformation);

    /**
     * 添加药品
     * @param druginformation
     * @return
     */
    int addDrugInformation(Druginformation druginformation);

    /**
     * 主键查询
     * @param maintenanceId
     * @return
     */
    Druginformation getById(Long maintenanceId);

    /**
     * 修改
     * @param druginformation
     * @return
     */
    int updateDrugInformation(Druginformation druginformation);

    /**
     * 批量删除
     * @param maintenanceIds
     * @return
     */
    int removeDrugInformation(Long[] maintenanceIds);

    /**
     * 查询所有厂家
     * @return
     */
    List<Manufacturer> getAll();

    /**
     * 查询所有药品
     * @return
     */
    List<TypeMedicine> getAllMedicine();

    /**
     * 查询所有处方
     * @return
     */
    List<TypePrescription>getAllPrescription();
}
