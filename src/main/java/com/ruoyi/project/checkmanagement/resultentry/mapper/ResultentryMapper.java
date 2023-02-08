package com.ruoyi.project.checkmanagement.resultentry.mapper;

import com.ruoyi.project.checkmanagement.resultentry.domin.Resultentry;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author yhb
 * @Date 2021/7/14 8:31
 */
@Mapper
public interface ResultentryMapper {

    /*@Select("select censo_id,censor_pathema,censor_name,status,censor_result,censor_date from  censor_yhb")*/
    List<Resultentry> selectAll(Resultentry resultentry);
}
