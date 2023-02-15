package com.ruoyi.project.drugmanagement.manufacturer.domain;

import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Manufacturer extends BaseEntity {
    /*厂家id*/
    @Excel(name = "厂家id")
    private Long manufacturerId;
    /*厂家名称*/
    @Excel(name = "厂家名称")
    private String manufacturerName;
    /*厂家编号*/
    @Excel(name = "厂家编号")
    private String manufacturerNum;
    /*联系人*/
    @Excel(name = "联系人")
    private String contactPerson;
    /*电话*/
    @Excel(name = "电话")
    private String phone;
    /*关键字*/
    @Excel(name = "关键字")
    private String keyword;
    /*状态*/
    @Excel(name = "状态")
    private String status;
    /*地址*/
    @Excel(name = "地址")
    private String address;
}
