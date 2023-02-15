package com.ruoyi.project.drugmanagement.procurement.mapper;

import com.ruoyi.project.drugmanagement.druginformation.domain.Druginformation;
import com.ruoyi.project.drugmanagement.druginformation.domain.TypePrescription;
import com.ruoyi.project.drugmanagement.manufacturer.domain.Manufacturer;
import com.ruoyi.project.drugmanagement.procurement.domain.DruPurchase;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DruPurchaseMapper {


    /**
     * 根据条件查询采购订单信息
     *
     * @param druPurchase  传递采购订单查询条件参数
     * @return  返回查询结果集合
     */
   // @Select("select * from procurement")
    List<DruPurchase> selectAll(DruPurchase druPurchase);


    /**
     * 批量删除
     * @return
     */
    @Delete("delete from warehousingaudit_yjd where documents_id= #{procurement_id}")
    int removeDruPurchase (@Param("procurement_id") String procurement_id);


    /**
     * 主键查询
     * @param procurement_id
     * @return
     */
    @Select("select * from procurement where procurement_id= #{procurement_id}")
    DruPurchase selectById(String procurement_id);


    /**
     * 新增
     * @param druPurchase
     * @return
     */
    int insert(DruPurchase druPurchase);

    /**
     * 修改
     * @param druPurchase
     * @return
     */
    int update(DruPurchase druPurchase);

    /**
     * 查询所有供应商的信息
     * @return
     */
    List<DruPurchase> selectSupplier();



    int addPurchase(DruPurchase druPurchase);

    int updateOperationUser(DruPurchase druPurchase);

    int submitAudit(String[] dpids, String state);

    int deletePurchase(String[] dpids);
}
