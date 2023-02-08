package com.ruoyi.project.drugmanagement.manufacturer.service.impl;

import com.ruoyi.project.drugmanagement.manufacturer.domain.Manufacturer;
import com.ruoyi.project.drugmanagement.manufacturer.mapper.ManufacturerMapper;
import com.ruoyi.project.drugmanagement.manufacturer.service.ManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author vincent
 * @data 2021-7-13 14:22
 **/
@Service
public class ManufacturerServiceImpl implements ManufacturerService {
    @Autowired
    private ManufacturerMapper manufacturerMapper;

    /**
     * 查询厂家
     * @param manufacturer
     * @return
     */
    @Override
    public List<Manufacturer> selectList(Manufacturer manufacturer) {
        return manufacturerMapper.selectList(manufacturer);
    }

    /**
     * 新增
     * @param manufacturer
     * @return
     */
    @Override
    public int addManufacturer(Manufacturer manufacturer) {
        manufacturer.setCreateTime(new Date());
        return manufacturerMapper.insert(manufacturer);
    }

    /**
     * 根据主键查询
     * @param manufacturerId
     * @return
     */
    @Override
    public Manufacturer getById(Long manufacturerId) {
        return manufacturerMapper.selectById(manufacturerId);
    }

    @Override
    public int updateManufacturer(Manufacturer manufacturer) {
        manufacturer.setUpdateTime(new Date());
        return manufacturerMapper.update(manufacturer);
    }

    @Override
    public int removeManufacturerIds(Long[] manufacturerIds) {
        return manufacturerMapper.batchDelete(manufacturerIds);
    }

}
