package com.ruoyi.project.drugmanagement.supplier.domain;

import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author vincent
 * @data 2021-7-14 10:01
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Supplier extends BaseEntity {
    /*供应商ID*/
    @Excel(name = "供应商ID")
    private Long supplierId;
    /*供应商名称*/
    @Excel(name = "供应商名称")
    private String supplierName;
    /*联系人*/
    @Excel(name = "联系人")
    private String contactPerson;
    /*联系人手机*/
    @Excel(name = "联系人手机")
    private String contactPhone;
    /*联系人电话*/
    @Excel(name = "联系人电话")
    private String contactTel;
    /*银行账户*/
    @Excel(name = "银行账户")
    private String bankAccounts;
    /*地址*/
    @Excel(name = "地址")
    private String address;
    /*状态*/
    @Excel(name = "状态")
    private String status;
}
