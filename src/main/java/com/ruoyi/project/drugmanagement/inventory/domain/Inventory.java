package com.ruoyi.project.drugmanagement.inventory.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.framework.web.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Inventory extends BaseEntity {

    //药品iD
    private Integer drugId;
    //药品名称
    private String drugName;
    //采购量
    private Integer wholesaleNumber;
    //批发价
    private Integer wholesalePrice;
    //批发额
    private Integer wholesaleTotalPrice;
    //批次号
    private String wholesaleNo;
    //库存量
    private  Integer inventory;

    private String maintenanceNum;
    //预警值
    private Integer warningValue;
    //生产厂家
    private String manufacturer;
    //药品类型
    private String drugType;
    //处方类型
    private String prescriptionType;
    //单位
    private String unit;
    //换算量
    private Integer conversionOf;
    //创建时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date firstTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date endTime;

}
