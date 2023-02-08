package com.ruoyi.project.chargemanagement.prescriptioncharge.service.impl;

import com.ruoyi.project.chargemanagement.prescriptioncharge.domain.Pres;
import com.ruoyi.project.chargemanagement.prescriptioncharge.mapper.PresMapper;
import com.ruoyi.project.chargemanagement.prescriptioncharge.service.IPresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PresServiceImpl implements IPresService {

    @Autowired
    private PresMapper presMapper;
    @Override
    public List<Pres> findPo(Pres pres) {
        return presMapper.selectPo(pres);
    }
}
