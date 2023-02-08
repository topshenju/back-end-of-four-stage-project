package com.ruoyi.project.seedoctor.doctorscheduling.service;

import com.ruoyi.project.seedoctor.doctorscheduling.domain.Doctorscheduling;
import com.ruoyi.project.seedoctor.doctorscheduling.domain.Scheduling;

import java.util.List;

/**
 * @author simba@onlying.cn
 * @date 2021/7/14 19:04
 */
public interface DoctorschedulingService {
    //查询所有医生
    List<Doctorscheduling> getDoctorsAll();

    //查询所有医生排班
    List<Scheduling> findAll(Doctorscheduling doctorscheduling);

    //查询单个医生排班详情
    Scheduling getfindOne(Integer sche_id);
}
