package com.ruoyi.project.datastatistics.salesstatistics.mapper;

import com.ruoyi.project.datastatistics.salesstatistics.domain.Drugs;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author Administrator
 * @Date 2021/7/14 16:41
 * @Version 1.0
 */
@Mapper
public interface DurgsMapper {

    List<Drugs> selectAll(Drugs drugs);
}
