package com.ruoyi.project.seedoctor.myscheduling.service.impl;

import com.ruoyi.project.seedoctor.myscheduling.domain.Scheduling2;
import com.ruoyi.project.seedoctor.myscheduling.mapper.MyschedulingMapper;
import com.ruoyi.project.seedoctor.myscheduling.service.MyschedulingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author simba@onlying.cn
 * @date 2021/7/16 16:45
 */
@Service
public class MyschedulingServiceImpl implements MyschedulingService {

    @Autowired
    private MyschedulingMapper myschedulingMapper;

    @Override
    public List<Scheduling2> findOne() {
        List<Scheduling2> scheduling2 = myschedulingMapper.selectOne();
        return scheduling2;
    }
}
