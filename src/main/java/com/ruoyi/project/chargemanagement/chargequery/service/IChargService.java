package com.ruoyi.project.chargemanagement.chargequery.service;

import com.ruoyi.project.chargemanagement.chargequery.domain.Charg;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IChargService {
    List<Charg> selectChargList(Charg charg);

}
