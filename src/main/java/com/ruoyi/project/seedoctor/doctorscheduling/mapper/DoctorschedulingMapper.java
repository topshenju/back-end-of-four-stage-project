package com.ruoyi.project.seedoctor.doctorscheduling.mapper;

import com.ruoyi.project.seedoctor.doctorscheduling.domain.Doctorscheduling;
import com.ruoyi.project.seedoctor.doctorscheduling.domain.Scheduling;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author simba@onlying.cn
 * @date 2021/7/14 19:04
 */
@Mapper
public interface DoctorschedulingMapper {

    List<Doctorscheduling> selectAll();

    //查询医生排班
    List<Scheduling> selectList(Doctorscheduling doctorscheduling);

    //查询单个医生排班详情
    Scheduling selectOne(Integer sche_id);
}
