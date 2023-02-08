package com.ruoyi.project.drugmanagement.supplier.service;

import com.ruoyi.project.drugmanagement.supplier.domain.Supplier;

import java.util.List;

/**
 * @author vincent
 * @data 2021-7-14 13:45
 **/
public interface SupplierService {
    /**
     * 根据查询条件，访问数据库，查询供应商
     * 分页逻辑使用PageHelper实现。
     * @param supplier
     * @return
     */
    List<Supplier> selectList(Supplier supplier);

    /**
     * 新增供应商
     * @param supplier
     * @return
     */
    int addSupplier(Supplier supplier);

    /**
     * 主键查询
     * @param supplierId
     * @return
     */
    Supplier getById(Long supplierId);

    /**
     * 修改
     * @param supplier
     * @return
     */
    int updateSupplier(Supplier supplier);

    /**
     * 批量删除
     * @param suppliers
     * @return
     */
    int removeSuppliers(Long[] suppliers);
}
