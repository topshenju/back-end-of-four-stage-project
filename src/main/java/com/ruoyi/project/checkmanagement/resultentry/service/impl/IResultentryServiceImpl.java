package com.ruoyi.project.checkmanagement.resultentry.service.impl;

import com.ruoyi.project.checkmanagement.resultentry.domin.Resultentry;
import com.ruoyi.project.checkmanagement.resultentry.mapper.ResultentryMapper;
import com.ruoyi.project.checkmanagement.resultentry.service.IResultentryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author yhb
 * @Date 2021/7/14 8:45
 */
@Service
public class IResultentryServiceImpl implements IResultentryService {
    @Autowired
    private ResultentryMapper resultentryMapper;;

    @Override
    public List<Resultentry> findAll(Resultentry resultentry) {
        return resultentryMapper.selectAll(resultentry);
    }
}
