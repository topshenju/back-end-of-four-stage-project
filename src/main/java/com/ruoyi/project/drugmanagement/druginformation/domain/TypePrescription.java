package com.ruoyi.project.drugmanagement.druginformation.domain;

import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 处方类型表
 * @author vincent
 * @data 2021-7-15 9:58
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TypePrescription extends BaseEntity {
    /*处方id*/
    @Excel(name = "处方id")
    private Long prescriptionId;
    /*处方名称*/
    @Excel(name = "处方名称")
    private String prescriptionName;
}
