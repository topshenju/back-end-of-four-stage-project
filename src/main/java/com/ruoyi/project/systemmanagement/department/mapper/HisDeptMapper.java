package com.ruoyi.project.systemmanagement.department.mapper;

import com.ruoyi.project.systemmanagement.department.domain.HisDept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface HisDeptMapper {
/*根据 条件查科室*/
    List<HisDept> selectList(HisDept hisDept);
    //添加科室
    int insert(HisDept hisDept);
    //主键查询
    HisDept selectById(Long deptId);
    /*修改*/
    int update(HisDept hisDept);

    /*删除*/
    int batchDelete(@Param("deptId") Long[] deptId);

}
