package com.ruoyi.project.seedoctor.outpatientservice.service;

import com.ruoyi.project.seedoctor.outpatientservice.domain.Charge;
import com.ruoyi.project.seedoctor.outpatientservice.domain.Registered;
import com.ruoyi.project.seedoctor.registrationlist.domain.RegList;

import java.util.List;

/**
 * @Author Ada
 * @Date 2021/7/15 9:47
 */
public interface OutpatientService {

    Registered findId(String idNumber);

    List<Registered> findOne(Registered registered);

    List<Charge> findMore(Charge charge);

    List<Charge> findType();

    List<Charge> findPeriod();

}
