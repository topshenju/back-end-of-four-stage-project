package com.ruoyi.project.datastatistics.paymentsstatistics.domain;

import com.ruoyi.framework.web.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author Administrator
 * @Date 2021/7/15 9:18
 * @Version 1.0
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Pay extends BaseEntity {
    private Integer refundAmount;
    private Integer chargeAmount;
    private Integer cashInCome;
    private Integer aliPayRevent;
    private Integer aliPayRefund;
    private Integer cashRefund;

}
