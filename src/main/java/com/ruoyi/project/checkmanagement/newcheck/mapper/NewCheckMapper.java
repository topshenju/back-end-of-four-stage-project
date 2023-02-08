package com.ruoyi.project.checkmanagement.newcheck.mapper;

import com.ruoyi.project.checkmanagement.newcheck.domin.NewCheck;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Author yhb
 * @Date 2021/7/13 14:20
 */
@Mapper
public interface NewCheckMapper {

    @Select("select censo_id as id,censor_pathema as path," +
            "censor_name as name,status as status " +
            " from censor_yhb " +
            " where censo_id=#{id}")
    NewCheck selectOne(String id);
}
