package com.ruoyi.project.drugmanagement.supplier.mapper;

import com.ruoyi.project.drugmanagement.supplier.domain.Supplier;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author vincent
 * @data 2021-7-14 10:07
 **/
@Mapper
public interface SupplierMapper {
    /**
     * 根据条件进行分页查询
     * @param supplier
     * @return
     */
    List<Supplier> selectList(Supplier supplier);

    /**
     * 新增
     * @param supplier
     * @return
     */
    int insert(Supplier supplier);

    /**
     * 主键查询
     * @param supplierId
     * @return
     */
    Supplier selectById(Long supplierId);

    /**
     * 更新
     * @param supplier
     * @return
     */
    int update(Supplier supplier);

    /**
     * 批量删除
     * @param supplierIds
     * @return
     */
    int batchDelete(@Param("supplierIds") Long[] supplierIds);
}
