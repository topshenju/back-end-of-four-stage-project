package com.ruoyi.project.systemmanagement.department.service;

import com.ruoyi.project.systemmanagement.department.domain.HisDept;

import java.util.List;

public interface IHisDeptService {
    /*查询科室*/
    List<HisDept> selectList(HisDept hisDept);

    /*新增科室*/
    int addHisDept(HisDept hisDept);
    /*修改的查询*/
    HisDept getById(Long deptId);
     /*修改*/
    int updateDept(HisDept hisDept);
    /*删除*/
    int removeDept(Long[] deptId);
}
