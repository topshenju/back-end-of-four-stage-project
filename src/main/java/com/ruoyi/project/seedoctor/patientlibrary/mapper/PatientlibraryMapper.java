package com.ruoyi.project.seedoctor.patientlibrary.mapper;

import com.ruoyi.project.seedoctor.patientlibrary.domain.Patientlibrary;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author simba@onlying.cn
 * @date 2021/7/13 15:41
 */
@Mapper
public interface PatientlibraryMapper {
    /**
     * 根据条件，查询患者
     * @param patientlibrary
     * @return
     */
    List<Patientlibrary> selectList(Patientlibrary patientlibrary);
}
