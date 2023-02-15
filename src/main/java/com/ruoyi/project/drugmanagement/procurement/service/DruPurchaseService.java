package com.ruoyi.project.drugmanagement.procurement.service;

import com.ruoyi.project.drugmanagement.druginformation.domain.Druginformation;
import com.ruoyi.project.drugmanagement.procurement.domain.DruDrug;
import com.ruoyi.project.drugmanagement.procurement.domain.DruPurchase;
import com.ruoyi.project.drugmanagement.procurement.domain.DruPurchaseDrug;

import java.util.List;
import java.util.Map;

public interface DruPurchaseService {

    /**
     * 根据条件查询采购订单信息
     *
     * @param druPurchase  传递采购订单查询条件参数
     * @return  返回查询结果集合
     */
    List<DruPurchase> selectAll(DruPurchase druPurchase);

    //批量删除
    int removeDruPurchases(String[] procurement_id);

    //新增
    int addDruPurchase(DruPurchase druPurchase);

    //修改
    public int updateDruPurchase(DruPurchase druPurchase);
    /**
     * 主键查询
     */
    DruPurchase getById(String procurement_id);

    List<DruPurchase> selectSupplier();

    Map<String, Object> selectParticulars(String dpid);

    int submitAudit(String[] dpids, String state);


    int updateDruPurchase(String[] procurement_ids, int state);

    int updatepurchase(DruPurchase druPurchase);

    int add(List<DruPurchaseDrug> druPurchaseDrugs);
}
