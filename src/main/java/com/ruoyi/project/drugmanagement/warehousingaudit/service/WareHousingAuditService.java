package com.ruoyi.project.drugmanagement.warehousingaudit.service;

import com.ruoyi.project.drugmanagement.warehousingaudit.domain.Drug;

import java.util.List;

/**
 * @Author Ada
 * @Date 2021/7/13 20:16
 */
public interface WareHousingAuditService {

    List<Drug> findMore(Drug drug);

    int changeOne(int documentsId);

    int change(int documentsId);

}
