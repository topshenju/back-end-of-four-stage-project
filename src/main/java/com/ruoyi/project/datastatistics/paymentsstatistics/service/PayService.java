package com.ruoyi.project.datastatistics.paymentsstatistics.service;

import com.ruoyi.project.datastatistics.paymentsstatistics.domain.Pay;

import java.util.List;

/**
 * @Author Administrator
 * @Date 2021/7/15 9:24
 * @Version 1.0
 */
public interface PayService {
    List<Pay> findPay(Pay pay);
}
