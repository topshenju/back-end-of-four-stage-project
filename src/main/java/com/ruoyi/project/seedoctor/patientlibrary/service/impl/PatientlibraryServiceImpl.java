package com.ruoyi.project.seedoctor.patientlibrary.service.impl;

import com.ruoyi.project.seedoctor.patientlibrary.domain.Patientlibrary;
import com.ruoyi.project.seedoctor.patientlibrary.mapper.PatientlibraryMapper;
import com.ruoyi.project.seedoctor.patientlibrary.service.PatientlibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author simba@onlying.cn
 * @date 2021/7/13 15:42
 */
@Service
public class PatientlibraryServiceImpl implements PatientlibraryService {

    @Autowired
    private PatientlibraryMapper patientlibraryMapper;

    /**
     * 查询患者
     * @param patientlibrary 查询条件
     * @return
     */
    @Override
    public List<Patientlibrary> selectList(Patientlibrary patientlibrary) {
        List<Patientlibrary> list = patientlibraryMapper.selectList(patientlibrary);
        return list;
    }

    @Override
    public Patientlibrary getRegPatient(String sick_Certificate) {
        return patientlibraryMapper.getRegPatient(sick_Certificate);
    }
}
