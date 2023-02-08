package com.ruoyi.project.drugmanagement.warehousingaudit.mapper;

import com.ruoyi.project.drugmanagement.warehousingaudit.domain.Drug;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author Ada
 * @Date 2021/7/13 20:43
 */
@Mapper
public interface WareHousingAuditMapper {

    List<Drug> selectMore(Drug drug);

    int updateOne(int documentsId);

    int update(int documentsId);

}
