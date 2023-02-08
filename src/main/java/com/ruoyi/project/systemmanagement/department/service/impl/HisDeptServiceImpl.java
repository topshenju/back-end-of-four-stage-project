package com.ruoyi.project.systemmanagement.department.service.impl;

import com.ruoyi.project.systemmanagement.department.domain.HisDept;
import com.ruoyi.project.systemmanagement.department.mapper.HisDeptMapper;
import com.ruoyi.project.systemmanagement.department.service.IHisDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class HisDeptServiceImpl implements IHisDeptService {
    @Autowired
    private HisDeptMapper hisDeptMapper;
    @Override
    public List<HisDept> selectList(HisDept hisDept) {
      List<HisDept>list=  hisDeptMapper.selectList(hisDept);
        return list;
    }

    @Override
    public int addHisDept(HisDept hisDept) {
      hisDept.setCreateTime(new Date());
        return hisDeptMapper.insert(hisDept);
    }

    @Override
    public HisDept getById(Long deptId) {
        return hisDeptMapper.selectById(deptId);
    }

    @Override
    public int updateDept(HisDept hisDept) {
       hisDept.setUpdateTime(new Date());
        return hisDeptMapper.update(hisDept);
    }

    @Override
    public int removeDept(Long[] deptId) {
        return hisDeptMapper.batchDelete(deptId);
    }

}
