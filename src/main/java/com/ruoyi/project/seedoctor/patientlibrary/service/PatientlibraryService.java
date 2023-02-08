package com.ruoyi.project.seedoctor.patientlibrary.service;

import com.ruoyi.project.seedoctor.patientlibrary.domain.Patientlibrary;

import java.util.List;

/**
 * @author simba@onlying.cn
 * @date 2021/7/13 15:41
 */
public interface PatientlibraryService {
    /**
     * 根据查询条件，访问数据库，查询科室
     * 分页逻辑使用PageHelper 实现
     * @param patientlibrary
     * @return
     */
    List<Patientlibrary> selectList(Patientlibrary patientlibrary);


    /**
     * 根据身份证号码查询病人信息
     * @param sick_Certificate
     * @return
     */
    Patientlibrary getRegPatient(String sick_Certificate);
}
