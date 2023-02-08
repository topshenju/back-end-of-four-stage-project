package com.ruoyi.project.drugmanagement.manufacturer.mapper;

import com.ruoyi.project.drugmanagement.manufacturer.domain.Manufacturer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author vincent
 * @data 2021-7-13 13:55
 **/
@Mapper
public interface ManufacturerMapper {

    /**
     * 根据条件进行分页查询厂家数据
     * @param manufacturer
     * @return
     */
    List<Manufacturer> selectList(Manufacturer manufacturer);


    /**
     * 新增
     * @param manufacturer
     * @return
     */
    int insert(Manufacturer manufacturer);

    /**
     * 主键查询
     * @param manufacturerId
     * @return
     */
    Manufacturer selectById(Long manufacturerId);


    /**
     * 更新
     * @param manufacturer
     * @return
     */
    int update(Manufacturer manufacturer);

    /**
     * 批量删除
     * @param manufacturerIds
     * @return
     */
    int batchDelete(@Param("manufacturerIds") Long[] manufacturerIds);

}
