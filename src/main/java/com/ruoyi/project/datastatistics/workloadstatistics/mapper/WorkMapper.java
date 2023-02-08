package com.ruoyi.project.datastatistics.workloadstatistics.mapper;

import com.ruoyi.project.datastatistics.workloadstatistics.domain.Work;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author Administrator
 * @Date 2021/7/14 20:07
 * @Version 1.0
 */
@Mapper
public interface WorkMapper {
    List<Work> selectWork(Work work);

    int updateWork(Work work);

    Work selectById(Integer registerId);
//    添加
    int saveWork(Work work);
//    删除
    int delete(@Param("registerIds")Integer[] registerIds);

}
