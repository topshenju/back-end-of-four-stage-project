package com.ruoyi.project.systemmanagement.checkcost.mapper;

import com.ruoyi.project.systemmanagement.checkcost.domain.HisCheckCost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface HisCheckCostMapper {

    List<HisCheckCost> selectCheckLsit(HisCheckCost hisCheckCost);

    List<HisCheckCost> getALL();

    int insertCheck(HisCheckCost hisCheckCost);

    HisCheckCost getCheckById(Long checkId);

    int updateCheck(HisCheckCost hisCheckCost);

    int removeCheck(@Param("checkId") Long[] checkId);
}
