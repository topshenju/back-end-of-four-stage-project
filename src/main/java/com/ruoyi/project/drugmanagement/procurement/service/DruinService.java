package com.ruoyi.project.drugmanagement.procurement.service;

import com.ruoyi.project.drugmanagement.procurement.domain.DruDrug;

import java.util.List;

public interface DruinService {


    List<DruDrug> selectDdType();

    List<DruDrug> selectPrescriptionType();

    List<DruDrug> selectAll(DruDrug druDrug);

    int addDrug(DruDrug druDrug);

    DruDrug selectOne(int ddid);

    int updateDrug(DruDrug druDrug);

    int deleteDrug(int[] ddids);
}
