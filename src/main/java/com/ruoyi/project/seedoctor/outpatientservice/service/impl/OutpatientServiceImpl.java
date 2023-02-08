package com.ruoyi.project.seedoctor.outpatientservice.service.impl;

import com.ruoyi.project.seedoctor.outpatientservice.domain.Charge;
import com.ruoyi.project.seedoctor.outpatientservice.domain.Registered;
import com.ruoyi.project.seedoctor.outpatientservice.mapper.OutpatientServiceMapper;
import com.ruoyi.project.seedoctor.outpatientservice.service.OutpatientService;
import com.ruoyi.project.seedoctor.registrationlist.domain.RegList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Ada
 * @Date 2021/7/15 9:48
 */
@Service
public class OutpatientServiceImpl implements OutpatientService {

    @Autowired
    private OutpatientServiceMapper outpatientServiceMapper;

    @Override
    public Registered findId(String idNumber) {
        return outpatientServiceMapper.selectMoreId(idNumber);
    }

    @Override
    public List<Registered> findOne(Registered registered) {
        return outpatientServiceMapper.selectOne(registered);
    }

    @Override
    public List<Charge> findMore(Charge charge) {
        return outpatientServiceMapper.selectMore(charge);
    }

    @Override
    public List<Charge> findType() {
        return outpatientServiceMapper.selectType();
    }

    @Override
    public List<Charge> findPeriod() {
        return outpatientServiceMapper.selectPeriod();
    }

}
