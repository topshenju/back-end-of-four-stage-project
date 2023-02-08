package com.ruoyi.project.chargemanagement.refundquery.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.framework.web.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ref extends BaseEntity {
    private static final long serialVersionUID = 1L;

    private String presregid;
    private String chargregid;//订单号
    private String prespatientname;
    private Double reftfmoney;//退费金额
    private String reftfpayment;//退费方式
    private String refstatus;//订单状态
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date reftime;//创建时间
    private String refcaozuo;
}
