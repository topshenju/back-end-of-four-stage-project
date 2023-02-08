package com.ruoyi.project.seedoctor.doctorscheduling.service.impl;

import com.ruoyi.project.seedoctor.doctorscheduling.domain.Doctorscheduling;
import com.ruoyi.project.seedoctor.doctorscheduling.domain.Scheduling;
import com.ruoyi.project.seedoctor.doctorscheduling.mapper.DoctorschedulingMapper;
import com.ruoyi.project.seedoctor.doctorscheduling.service.DoctorschedulingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author simba@onlying.cn
 * @date 2021/7/14 19:05
 */
@Service
public class DoctorschedulingServiceImpl implements DoctorschedulingService {

    @Autowired
    private DoctorschedulingMapper doctorschedulingMapper;
    /**
     * 查询所有医生
     * @return
     */
    @Override
    public List<Doctorscheduling> getDoctorsAll() {
        return doctorschedulingMapper.selectAll();
    }

    //查询所有医生排班
    @Override
    public List<Scheduling> findAll(Doctorscheduling doctorscheduling) {
        List<Scheduling> list = doctorschedulingMapper.selectList(doctorscheduling);
        return list;
    }

    @Override
    public Scheduling getfindOne(Integer sche_id) {
        return doctorschedulingMapper.selectOne(sche_id);
    }

}
