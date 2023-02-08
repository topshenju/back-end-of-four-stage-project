package com.ruoyi.project.systemmanagement.registrationfee.service;

import com.ruoyi.project.systemmanagement.checkcost.domain.HisCheckCost;
import com.ruoyi.project.systemmanagement.registrationfee.domain.ReGistRationFee;

import java.util.List;

public interface ReGistRationFeeService {
    List<ReGistRationFee> serviceReGistRationFee(ReGistRationFee reGistRationFee);

    int serviceReAdd(ReGistRationFee reGistRationFee);

    ReGistRationFee getReGistRationFee(Long regisId);

    int updateReGistRationFee(ReGistRationFee reGistRationFee);

    int removeReGistRationFee(Long[] regisId);
}
