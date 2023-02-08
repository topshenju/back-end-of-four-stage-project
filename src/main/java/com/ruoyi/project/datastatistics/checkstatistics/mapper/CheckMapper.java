package com.ruoyi.project.datastatistics.checkstatistics.mapper;

import com.ruoyi.project.datastatistics.checkstatistics.domain.Check;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author Administrator
 * @Date 2021/7/15 8:45
 * @Version 1.0
 */
@Mapper
public interface CheckMapper {

    List<Check> selectCheck(Check check);
}
