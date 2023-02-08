package com.ruoyi.project.datastatistics.checkstatistics.service.impl;

import com.ruoyi.project.datastatistics.checkstatistics.domain.Check;
import com.ruoyi.project.datastatistics.checkstatistics.mapper.CheckMapper;
import com.ruoyi.project.datastatistics.checkstatistics.service.CheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Administrator
 * @Date 2021/7/15 8:47
 * @Version 1.0
 */
@Service
public class CheckServiceImpl implements CheckService {
    @Autowired
    private CheckMapper checkMapper;

    @Override
    public List<Check> findCheck(Check check) {
        List<Check> checks = checkMapper.selectCheck(check);
        return checks;
    }
}
