package com.ruoyi.project.datastatistics.paymentsstatistics.controller;

import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.datastatistics.paymentsstatistics.domain.Pay;
import com.ruoyi.project.datastatistics.paymentsstatistics.mapper.PayMapper;
import com.ruoyi.project.datastatistics.paymentsstatistics.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author Administrator
 * @Date 2021/7/15 9:26
 * @Version 1.0
 */
@RestController
@RequestMapping("paymentsstatistics/shouzhi")
public class PayController extends BaseController {
    @Autowired
    private PayService payService;
    @GetMapping("/count")
    @PreAuthorize("@ss.hasPermi('system:paymentsstatistics:query')")
    public TableDataInfo findP(Pay pay){
        List<Pay> pays = payService.findPay(pay);
        System.out.println(pays);
        return getDataTable(pays);
    }
}
