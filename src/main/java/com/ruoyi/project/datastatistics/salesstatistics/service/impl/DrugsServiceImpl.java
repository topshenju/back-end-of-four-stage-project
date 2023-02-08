package com.ruoyi.project.datastatistics.salesstatistics.service.impl;

import com.ruoyi.project.datastatistics.salesstatistics.domain.Drugs;
import com.ruoyi.project.datastatistics.salesstatistics.mapper.DurgsMapper;
import com.ruoyi.project.datastatistics.salesstatistics.service.DrugsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Administrator
 * @Date 2021/7/14 16:48
 * @Version 1.0
 */
@Service
public class DrugsServiceImpl implements DrugsService {
    @Autowired
    private DurgsMapper durgsMapper;
    @Override
    public List<Drugs> selectDrug(Drugs drugs) {
        return durgsMapper.selectAll(drugs);
    }
}
