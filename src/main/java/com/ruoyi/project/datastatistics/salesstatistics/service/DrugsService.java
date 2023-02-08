package com.ruoyi.project.datastatistics.salesstatistics.service;

import com.ruoyi.project.datastatistics.salesstatistics.domain.Drugs;

import java.util.List;

/**
 * @Author Administrator
 * @Date 2021/7/14 16:46
 * @Version 1.0
 */
public interface DrugsService {
    List<Drugs> selectDrug(Drugs drugs);
}
