package com.ruoyi.project.drugmanagement.druginformation.domain;

import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class TypeMedicine extends BaseEntity {
    /*药品类型id*/
    @Excel(name = "药品类型id")
    private String drugtypeId;
    /*药品名称*/
    @Excel(name = "药品名称")
    private String medicineName;
}
