package com.ruoyi.project.drugmanagement.druginformation.mapper;

import com.ruoyi.project.drugmanagement.druginformation.domain.Druginformation;
import com.ruoyi.project.drugmanagement.druginformation.domain.TypeMedicine;
import com.ruoyi.project.drugmanagement.druginformation.domain.TypePrescription;
import com.ruoyi.project.drugmanagement.manufacturer.domain.Manufacturer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface DruginformationMapper {

    /**
     * 分页查询
     * @param druginformation
     * @return
     */
    List<Druginformation> selectList(Druginformation druginformation);

    /**
     * 新增
     * @param druginformation
     * @return
     */
    int insert(Druginformation druginformation);

    /**
     * 主键查询
     * @param maintenanceId
     * @return
     */
    Druginformation selectById(Long maintenanceId);

    /**
     * 查询所有药品
     * @return
     */
    List<Druginformation> selectAll();

    /**
     * 查询所有厂家
     * @return
     */
    @Select("select  manufacturer_id as manufacturerId ,  manufacturer_name as manufacturerName from manufacturer_maintenance group by manufacturerName")
    List<Manufacturer> selectAllManufacturer();
    /**
     * 查询所有药品类型
     *
     * @param
     * @return
     */
    @Select("select drugtype_id as drugtypeId,medicine_name as medicineName  from type_medicine  group by medicineName")
    List<TypeMedicine> selectAllMedicine();

    /**
     * 查询所有处方名称
     *
     * @param
     * @return
     */
    @Select("select prescription_id as prescriptionId, prescription_name as prescriptionName from type_prescription group by prescriptionName")
    List<TypePrescription> selectAllPrescription();


    /**
     * 更新
     * @param druginformation
     * @return
     */
    int update(Druginformation druginformation);

    /**
     * 批量删除
     * @param maintenanceIds
     * @return
     */
    int batchDelete(@Param("maintenanceIds") Long[] maintenanceIds);
}
