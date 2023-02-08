package com.ruoyi.project.system.service.impl;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.project.system.domain.HisDepts;
import com.ruoyi.project.system.mapper.HisDeptsMapper;
import com.ruoyi.project.system.service.IHisDeptsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 科室信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-02-07
 */
@Service
public class HisDeptsServiceImpl implements IHisDeptsService 
{
    @Autowired
    private HisDeptsMapper hisDeptsMapper;

    /**
     * 查询科室信息
     * 
     * @param deptsId 科室信息ID
     * @return 科室信息
     */
    @Override
    public HisDepts selectHisDeptsById(Long deptsId)
    {
        return hisDeptsMapper.selectHisDeptsById(deptsId);
    }

    /**
     * 查询科室信息列表
     * 
     * @param hisDepts 科室信息
     * @return 科室信息
     */
    @Override
    public List<HisDepts> selectHisDeptsList(HisDepts hisDepts)
    {
        return hisDeptsMapper.selectHisDeptsList(hisDepts);
    }

    /**
     * 新增科室信息
     * 
     * @param hisDepts 科室信息
     * @return 结果
     */
    @Override
    public int insertHisDepts(HisDepts hisDepts)
    {
        hisDepts.setCreateTime(DateUtils.getNowDate());
        return hisDeptsMapper.insertHisDepts(hisDepts);
    }

    /**
     * 修改科室信息
     * 
     * @param hisDepts 科室信息
     * @return 结果
     */
    @Override
    public int updateHisDepts(HisDepts hisDepts)
    {
        hisDepts.setUpdateTime(DateUtils.getNowDate());
        return hisDeptsMapper.updateHisDepts(hisDepts);
    }

    /**
     * 批量删除科室信息
     * 
     * @param deptsIds 需要删除的科室信息ID
     * @return 结果
     */
    @Override
    public int deleteHisDeptsByIds(Long[] deptsIds)
    {
        return hisDeptsMapper.deleteHisDeptsByIds(deptsIds);
    }

    /**
     * 删除科室信息信息
     * 
     * @param deptsId 科室信息ID
     * @return 结果
     */
    @Override
    public int deleteHisDeptsById(Long deptsId)
    {
        return hisDeptsMapper.deleteHisDeptsById(deptsId);
    }
}
