package com.ruoyi.project.datastatistics.paymentsstatistics.service.impl;

import com.ruoyi.project.datastatistics.paymentsstatistics.domain.Pay;
import com.ruoyi.project.datastatistics.paymentsstatistics.mapper.PayMapper;
import com.ruoyi.project.datastatistics.paymentsstatistics.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Administrator
 * @Date 2021/7/15 9:25
 * @Version 1.0
 */
@Service
public class PayServiceImpl implements PayService {
    @Autowired
    private PayMapper payMapper;

    @Override
    public List<Pay> findPay(Pay pay) {
        List<Pay> pays = payMapper.selectPay(pay);
        return pays;
    }
}
