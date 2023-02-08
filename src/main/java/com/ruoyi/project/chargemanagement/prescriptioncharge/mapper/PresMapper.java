package com.ruoyi.project.chargemanagement.prescriptioncharge.mapper;

import com.ruoyi.project.chargemanagement.prescriptioncharge.domain.Pres;

import javax.validation.constraints.Max;
import java.util.List;

public interface PresMapper {
    List<Pres>  selectPo(Pres pres);

}
