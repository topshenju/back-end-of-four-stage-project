package com.ruoyi.project.chargemanagement.chargequery.service.impl;

import com.ruoyi.project.chargemanagement.chargequery.domain.Charg;
import com.ruoyi.project.chargemanagement.chargequery.mapper.ChargMapper;
import com.ruoyi.project.chargemanagement.chargequery.service.IChargService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChargService implements IChargService {


    @Autowired
    private ChargMapper chargMapper;

    @Override
    public List<Charg> selectChargList(Charg charg) {
        return chargMapper.selectChargList(charg);
    }
}
