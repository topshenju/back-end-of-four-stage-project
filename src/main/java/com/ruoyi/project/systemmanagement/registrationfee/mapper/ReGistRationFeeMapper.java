package com.ruoyi.project.systemmanagement.registrationfee.mapper;

import com.ruoyi.project.systemmanagement.registrationfee.domain.ReGistRationFee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ReGistRationFeeMapper {

    /*查询*/
    List<ReGistRationFee> ReGistRationFeeLList(ReGistRationFee reGistRationFee);
   /*添加*/
    int reGistRationAdd(ReGistRationFee reGistRationFee);

    ReGistRationFee getReGist(Long regisId);

    int reGistRationupdate(ReGistRationFee reGistRationFee);

    int reGistRationRemove(@Param("regisId") Long[] regisId);
}
