package com.ruoyi.project.drugmanagement.procurement.domain;

import com.ruoyi.framework.web.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class DruDrug extends BaseEntity {

    private Integer ddid;  // 药品ID
    private String ddName;  // 药品名称
    private String ddCoding;  // 药品编码
    private String dmid;  // 生产厂家
    private String ddType;  // 药品类型
    private String ddPrescriptionType;  // 处方类型
    private String ddUnit;  // 单位
    private Double ddPrice;  // 处方价格
    private Integer ddNum;  // 库存量
    private Integer ddEarlyWarning;  // 预警值
    private Integer ddMatrixing;  // 换算量
    private String ddState;  // 状态
    private String ddKeyword;  // 关键字
    private DruManufacturer druManufacturer;  // 生产厂家对象

}