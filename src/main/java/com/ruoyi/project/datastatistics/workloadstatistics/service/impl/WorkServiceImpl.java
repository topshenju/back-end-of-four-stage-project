package com.ruoyi.project.datastatistics.workloadstatistics.service.impl;

import com.ruoyi.project.datastatistics.workloadstatistics.domain.Work;
import com.ruoyi.project.datastatistics.workloadstatistics.mapper.WorkMapper;
import com.ruoyi.project.datastatistics.workloadstatistics.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Administrator
 * @Date 2021/7/14 20:10
 * @Version 1.0
 */
@Service
public class WorkServiceImpl implements WorkService {
    @Autowired
    private WorkMapper workMapper;

    @Override
    public List<Work> findWork(Work work) {
        return workMapper.selectWork(work);
    }
//删除
    @Override
    public int deleteWork(Integer[] registerIds) {
        return workMapper.delete(registerIds);
    }

    @Override
    public int xiugai(Work work) {
        return workMapper.updateWork(work);
    }

    @Override
    public int insertWork(Work work) {
        return workMapper.saveWork(work);
    }

    @Override
    public Work getId(Integer registerId) {
        return workMapper.selectById(registerId);
    }
}
