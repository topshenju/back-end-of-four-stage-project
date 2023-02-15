package com.ruoyi.project.drugmanagement.procurement.domain;

import com.ruoyi.framework.web.domain.BaseEntity;
import io.swagger.models.auth.In;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.net.Inet4Address;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class DruPurchaseDrug extends BaseEntity {

    private String dpdid;  // 主键ID
    private String dpid;  // 订单ID
    private Integer ddid;  // 药品ID
    private Double tradePrice;  // 批发价
    private Integer drugNum;  // 购买药品数量
    private String batch;  // 批次号
    private String remark;  // 备注
    private DruDrug druDrug;  // 药品对象
}
