package com.ruoyi.project.drugmanagement.procurement.mapper;

import com.ruoyi.project.drugmanagement.procurement.domain.DruPurchaseDrug;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DruPurchaseDrugMapper {

    /**
     * 根据采购订单ID查询订单内的所有药品信息
     *
     * @param dpid  订单ID
     * @return  返回订单内的所有药品信息
     */
    List<DruPurchaseDrug> selectAll(String dpid);

    /**
     *采购单添加新药品信息
     *
     * @param druPurchaseDrug  药品信息
     * @return  返回1成功
     */
    int addDrug(DruPurchaseDrug druPurchaseDrug);

    /**
     *采购单修改药品信息
     *
     * @param druPurchaseDrug  药品信息
     * @return  返回1成功
     */
    int updateDrug(DruPurchaseDrug druPurchaseDrug);

    /**
     * 根据订单号和药品id查询是否有此数据
     *
     * @param dpid  订单id
     * @param ddid  药品id
     * @return  数据对象
     */
    DruPurchaseDrug selectOne(String dpid,Integer ddid);

    /**
     * 根据订单号删除所有药品信息
     *
     * @param dpid 订单号
     * @return  成功返回1
     */
    int deleteDrug(String dpid);

    int addWarehousing(DruPurchaseDrug druPurchaseDrug);

    int addDrugAndRelation(DruPurchaseDrug druPurchaseDrug);

}
