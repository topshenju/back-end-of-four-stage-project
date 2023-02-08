package com.ruoyi.project.checkmanagement.resultquery.mapper;

import com.ruoyi.project.checkmanagement.resultentry.domin.Resultentry;
import com.ruoyi.project.checkmanagement.resultquery.domin.Resultquery;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author yhb
 * @Date 2021/7/14 8:31
 */
@Mapper
public interface ResultqueryMapper {

    /*@Select("select censo_id,censor_pathema,censor_name,status,censor_result,censor_date from  censor_yhb")*/
    List<Resultquery> selectAll(Resultquery resultquery);
}
