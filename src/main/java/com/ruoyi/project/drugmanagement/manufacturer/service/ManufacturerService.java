package com.ruoyi.project.drugmanagement.manufacturer.service;

import com.ruoyi.project.drugmanagement.manufacturer.domain.Manufacturer;

import java.util.List;


public interface ManufacturerService {
    /**
     * 根据查询条件，访问数据库，查询厂家
     * 分页逻辑使用PageHelper实现。
     * @param manufacturer
     * @return
     */
    List<Manufacturer> selectList(Manufacturer manufacturer);

    /**
     * 新增厂家
     * @param manufacturer
     * @return
     */
    int addManufacturer(Manufacturer manufacturer);

    /**
     *
     * @param manufacturerId
     * @return
     */
    Manufacturer getById(Long manufacturerId);

    /**
     * 修改
     * @param manufacturer
     * @return
     */
    int updateManufacturer(Manufacturer manufacturer);

    /**
     * 删除
     * @param manufacturerIds
     * @return
     */
    int removeManufacturerIds(Long[] manufacturerIds);
}
