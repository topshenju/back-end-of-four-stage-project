package com.ruoyi.project.seedoctor.outpatientservice.mapper;

import com.ruoyi.project.seedoctor.outpatientservice.domain.Charge;
import com.ruoyi.project.seedoctor.outpatientservice.domain.Registered;
import com.ruoyi.project.seedoctor.registrationlist.domain.RegList;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author Ada
 * @Date 2021/7/15 9:47
 */
@Mapper
public interface OutpatientServiceMapper {


    Registered selectMoreId(String idNumber);

    List<Registered> selectOne(Registered registered);

    List<Charge> selectMore(Charge charge);

    List<Charge> selectType();

    List<Charge> selectPeriod();

}
