package com.ruoyi.project.system.mapper;

import com.ruoyi.project.system.domain.HisDepts;

import java.util.List;

/**
 * 科室信息Mapper接口
 * 
 * @author ruoyi
 * @date 2023-02-07
 */
public interface HisDeptsMapper 
{
    /**
     * 查询科室信息
     * 
     * @param deptsId 科室信息ID
     * @return 科室信息
     */
    public HisDepts selectHisDeptsById(Long deptsId);

    /**
     * 查询科室信息列表
     * 
     * @param hisDepts 科室信息
     * @return 科室信息集合
     */
    public List<HisDepts> selectHisDeptsList(HisDepts hisDepts);

    /**
     * 新增科室信息
     * 
     * @param hisDepts 科室信息
     * @return 结果
     */
    public int insertHisDepts(HisDepts hisDepts);

    /**
     * 修改科室信息
     * 
     * @param hisDepts 科室信息
     * @return 结果
     */
    public int updateHisDepts(HisDepts hisDepts);

    /**
     * 删除科室信息
     * 
     * @param deptsId 科室信息ID
     * @return 结果
     */
    public int deleteHisDeptsById(Long deptsId);

    /**
     * 批量删除科室信息
     * 
     * @param deptsIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteHisDeptsByIds(Long[] deptsIds);
}
