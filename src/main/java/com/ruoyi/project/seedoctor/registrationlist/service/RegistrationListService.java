package com.ruoyi.project.seedoctor.registrationlist.service;

import com.ruoyi.project.seedoctor.registrationlist.domain.RegList;

import java.util.List;

/**
 * @Author Ada
 * @Date 2021/7/15 21:24
 */
public interface RegistrationListService {

    List<RegList> findMore(RegList regList);

    List<RegList> findType();

    List<RegList> findPeriod();

    List<RegList> findStatus();

    byte[] getImage(String imageName);

}
