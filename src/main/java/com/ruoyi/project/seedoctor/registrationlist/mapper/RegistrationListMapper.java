package com.ruoyi.project.seedoctor.registrationlist.mapper;

import com.ruoyi.project.seedoctor.registrationlist.domain.RegList;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author Ada
 * @Date 2021/7/15 21:25
 */
@Mapper
public interface RegistrationListMapper {

    List<RegList> selectMore(RegList regList);

    List<RegList> selectType();

    List<RegList> selectPeriod();

    List<RegList> selectStatus();

}
