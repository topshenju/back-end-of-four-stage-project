package com.ruoyi.project.checkmanagement.resultquery.service.impl;

import com.ruoyi.project.checkmanagement.resultentry.domin.Resultentry;
import com.ruoyi.project.checkmanagement.resultentry.mapper.ResultentryMapper;
import com.ruoyi.project.checkmanagement.resultentry.service.IResultentryService;
import com.ruoyi.project.checkmanagement.resultquery.domin.Resultquery;
import com.ruoyi.project.checkmanagement.resultquery.mapper.ResultqueryMapper;
import com.ruoyi.project.checkmanagement.resultquery.service.IResultqueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author yhb
 * @Date 2021/7/14 8:45
 */
@Service
public class IResultqueryServiceImpl implements IResultqueryService {
    @Autowired
    private ResultqueryMapper resultqueryMapper;;

    @Override
    public List<Resultquery> findAll(Resultquery resultquery) {
        return resultqueryMapper.selectAll(resultquery);
    }


}
