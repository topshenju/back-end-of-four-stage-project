package com.ruoyi.project.drugmanagement.procurement.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.framework.web.domain.BaseEntity;
import com.ruoyi.project.drugmanagement.supplier.domain.Supplier;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DruPurchase extends BaseEntity {

    private String dpid;  // 单据ID
    private String dsid;  // 供应商
    private Double dpTotalAmount;  // 采购批发总额
    private String dpState;  // 状态
    private String applyUser;  // 申请人
    private String operationUser;  // 操作人
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date enterDate;  // 入库时间
   // private DruSupplier druSupplier;


}
