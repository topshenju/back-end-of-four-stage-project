package com.ruoyi.project.drugmanagement.supplier.service.impl;

import com.ruoyi.project.drugmanagement.supplier.domain.Supplier;
import com.ruoyi.project.drugmanagement.supplier.mapper.SupplierMapper;
import com.ruoyi.project.drugmanagement.supplier.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


@Service
public class SupplierServiceImpl implements SupplierService {
    @Autowired
    private SupplierMapper supplierMapper;

    /**
     * 分页查询厂家
     * @param supplier
     * @return
     */
    @Override
    public List<Supplier> selectList(Supplier supplier) {
        return supplierMapper.selectList(supplier);
    }

    /**
     * 新增
     * @param supplier
     * @return
     */
    @Override
    public int addSupplier(Supplier supplier) {
        supplier.setCreateTime(new Date());
        return supplierMapper.insert(supplier);
    }

    /**
     * 主键查询
     * @param supplierId
     * @return
     */
    @Override
    public Supplier getById(Long supplierId) {
        return supplierMapper.selectById(supplierId);
    }

    /**
     * 修改
     * @param supplier
     * @return
     */
    @Override
    public int updateSupplier(Supplier supplier) {
        supplier.setUpdateTime(new Date());
        return supplierMapper.update(supplier);
    }

    /**
     * 批量删除
     * @param suppliers
     * @return
     */
    @Override
    public int removeSuppliers(Long[] suppliers) {
        return supplierMapper.batchDelete(suppliers);
    }
}
