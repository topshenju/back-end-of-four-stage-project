package com.ruoyi.project.drugmanagement.druginformation.domain;

import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;
import com.ruoyi.project.drugmanagement.manufacturer.domain.Manufacturer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author vincent
 * @data 2021-7-14 16:13
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Druginformation extends BaseEntity {
    /*药品ID*/
    @Excel(name = "药品ID")
    private Long maintenanceId;
    /*药品名称*/
    @Excel(name = "药品名称")
    private String maintenanceName;
    /*药品编号*/
    @Excel(name = "药品编号")
    private String maintenanceNum;
    /*生产厂家*/
    @Excel(name = "生产厂家")
    private Long manufacturerId;
    /*药品类型*/
    @Excel(name = "药品类型")
    private Long drugtypeId;
    /*处方类型*/
    @Excel(name = "处方类型")
    private Long prescriptionId;
    /*单位*/
    @Excel(name = "单位")
    private String unit;
    /*处方价格*/
    @Excel(name = "处方价格")
    private int prescriptionPrice;
    /*库存量*/
    @Excel(name = "库存量")
    private int inventory;
    /*预警值*/
    @Excel(name = "预警值")
    private int warningValue;
    /*换算量*/
    @Excel(name = "换算量")
    private int conversionAmount;
    /*供应商*/
    @Excel(name = "供应商")
    private Long supplierIds;
    /*关键字*/
    @Excel(name = "关键字")
    private String keyword;
    /*状态*/
    @Excel(name = "状态")
    private String status;
    private TypeMedicine typeMedicine;
    private TypePrescription typePrescription;
    private Manufacturer manufacturer;

}
