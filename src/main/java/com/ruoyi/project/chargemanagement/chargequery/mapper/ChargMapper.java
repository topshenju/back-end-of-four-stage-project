package com.ruoyi.project.chargemanagement.chargequery.mapper;

import com.ruoyi.project.chargemanagement.chargequery.domain.Charg;

import java.util.List;

public interface ChargMapper {

    List<Charg>  selectChargList(Charg charg);
}
