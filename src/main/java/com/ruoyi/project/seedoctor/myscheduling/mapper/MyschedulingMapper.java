package com.ruoyi.project.seedoctor.myscheduling.mapper;


import com.ruoyi.project.seedoctor.myscheduling.domain.Scheduling2;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author simba@onlying.cn
 * @date 2021/7/16 16:45
 */
@Mapper
public interface MyschedulingMapper {
    List<Scheduling2> selectOne();
}
