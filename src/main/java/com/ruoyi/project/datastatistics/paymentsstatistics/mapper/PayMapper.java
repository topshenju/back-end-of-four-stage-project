package com.ruoyi.project.datastatistics.paymentsstatistics.mapper;

import com.ruoyi.project.datastatistics.checkstatistics.domain.Check;
import com.ruoyi.project.datastatistics.paymentsstatistics.domain.Pay;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author Administrator
 * @Date 2021/7/15 9:22
 * @Version 1.0
 */
@Mapper
public interface PayMapper {
    List<Pay> selectPay(Pay pay);
}
