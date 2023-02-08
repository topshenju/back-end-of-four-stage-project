package com.ruoyi.project.chargemanagement.chargequery.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.framework.web.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Charg extends BaseEntity {

    private static final long serialVersionUID = 1L;
    private String chargregid; //订单号
    private String presregid;  //挂号单号
    private String prespatientname; //患者姓名
    private Double chargmoney; //总金额
    private String chargpayment; //支付类型
    private String chargstatus;  //订单状态
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date chargtime;//创建时间
    private String chargcaozuo;//操作
}
