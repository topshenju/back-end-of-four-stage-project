package com.ruoyi.project.drugmanagement.procurement.service.impl;

import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.project.drugmanagement.druginformation.domain.Druginformation;
import com.ruoyi.project.drugmanagement.procurement.domain.DruDrug;
import com.ruoyi.project.drugmanagement.procurement.domain.DruPurchase;

import com.ruoyi.project.drugmanagement.procurement.domain.DruPurchaseDrug;
import com.ruoyi.project.drugmanagement.procurement.domain.DruPurchaseDrugVo;
import com.ruoyi.project.drugmanagement.procurement.mapper.DruPurchaseDrugMapper;
import com.ruoyi.project.drugmanagement.procurement.mapper.DruPurchaseMapper;
import com.ruoyi.project.drugmanagement.procurement.service.DruPurchaseService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author 杨巍
 * @data 2022-2-8 14:22
 **/
@Service
public class DruPurchaseServiceImpl implements DruPurchaseService {

    @Autowired
    DruPurchaseMapper druPurchaseMapper;

    @Autowired
    DruPurchaseDrugMapper druPurchaseDrugMapper;

    @Override
    public List<DruPurchase> selectAll(DruPurchase druPurchase) {
        return druPurchaseMapper.selectAll(druPurchase);
    }


    /**
     * 批量删除
     *
     * @return
     */
    @Override
    public int removeDruPurchases(String[] procurement_ids) {
        int j = 0;
        for (int i = 0; i < procurement_ids.length; i++) {
            druPurchaseMapper.removeDruPurchase(procurement_ids[i]);
            j = 1;
        }
        return j;
    }


    /**
     * 根据主键查询
     *
     * @param procurement_id
     * @return
     */
    @Override
    public DruPurchase getById(String procurement_id) {
        return druPurchaseMapper.selectById(procurement_id);
    }

    @Override
    public List<DruPurchase> selectSupplier() {
        List<DruPurchase> druPurchases = druPurchaseMapper.selectSupplier();
        return druPurchases;
    }

    //新增采购信息
    @Override
    public int addDruPurchase(DruPurchase druPurchase) {
        druPurchase.setCreateTime(new Date());
        return druPurchaseMapper.insert(druPurchase);
    }


    //修改采购信息
    @Override
    public int updateDruPurchase(DruPurchase druPurchase) {
        druPurchase.setUpdateTime(new Date());
        return druPurchaseMapper.update(druPurchase);
    }

    /**
     * 根据采购单号查询采购单详情信息
     *
     * @param dpid 采购单号
     * @return 返回携带采购订单信息和采购的药品信息集合
     */
    @Override
    public Map<String, Object> selectParticulars(String dpid) {

        Map<String, Object> map = new HashMap<>();

        if ("undefined".equals(dpid)) {

            DruPurchase druPurchase = new DruPurchase();
            long time = new Date().getTime()-1676340000000L;
            druPurchase.setDpid(time+"");
            druPurchase.setApplyUser(SecurityUtils.getUsername());
            druPurchase.setDpTotalAmount(0D);
            druPurchase.setCreateTime(new Date());

        /*int i = druPurchaseMapper.addPurchase(druPurchase);

        if (i == 1){
            map.put("druPurchase",druPurchase);
            map.put("drugList",null);
        }*/
            map.put("druPurchase", druPurchase);
            List<DruPurchaseDrug> drugList = new ArrayList<>();
            map.put("drugList", drugList);

        } else {
            // 获得采购订单信息
            DruPurchase druPurchase = druPurchaseMapper.selectById(dpid);

            // 获得采购的药品信息
            List<DruPurchaseDrug> drugList = druPurchaseDrugMapper.selectAll(dpid);

            map.put("druPurchase", druPurchase);
            map.put("drugList", drugList);
        }

        return map;
    }

//    /**
//     * 修改采购单信息
//     *
//     * @param druPurchase 采购单数据
//     * @return 成功返回1
//     */
//    @Override
//    public int updateDruPurchase(DruPurchase druPurchase) {
//        int flag = 0;
//        int updatepurchase = druPurchaseMapper.updatepurchase(druPurchase);
//        flag = updatepurchase;
//        if (updatepurchase != 1) {
//            int i = druPurchaseMapper.addPurchase(druPurchase);
//
//            if (i == 1) {
//                flag = 1;
//            }
//        }
//        return flag;
//    }


    /**
     * 提交审核
     *
     * @param dpids 订单号
     * @return 成功返回1
     */
    @Override
    public int submitAudit(String[] dpids, String state) {

        if ("0".equals(state)) {

            for (String dpid : dpids) {
                DruPurchase druPurchase = new DruPurchase();
                druPurchase.setDpid(dpid);
                druPurchase.setOperationUser(SecurityUtils.getUsername());
                druPurchase.setEnterDate(new Date());

                int i = 0;
                try {
                    i = druPurchaseMapper.updateOperationUser(druPurchase);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        return druPurchaseMapper.submitAudit(dpids, state);
    }

    //修改采购信息
    @Override
    public int updateDruPurchase(String[] procurement_ids,int state) {
        int index=0;
        DruPurchase druPurchase = new DruPurchase();
        //提交审核
        if (state==0){
            for (int i=0;i<procurement_ids.length;i++){
                druPurchase.setDpid(procurement_ids[i]);
                druPurchase.setDpState("1");//如果是待审核则改为正在审核
                druPurchaseMapper.update(druPurchase);
                index=1;
            }
            //提交入库
        }else if(state==2){
            for (int i=0;i<procurement_ids.length;i++){
                druPurchase.setDpid(procurement_ids[i]);
                druPurchase.setDpState("3");
                druPurchaseMapper.update(druPurchase);
                index=1;
            }
        }
        return index;
    }

    @Override
    public int updatepurchase(DruPurchase druPurchase) {
        int flag = 0;
        int updatepurchase = druPurchaseMapper.update(druPurchase);
        flag = updatepurchase;
        if (updatepurchase != 1){
            int i = druPurchaseMapper.addPurchase(druPurchase);

            if (i == 1){
                flag = 1;
            }
        }
        return flag;
    }

    @Override
    public int add(List<DruPurchaseDrug> druPurchaseDrugs) {
        for(int i=0;i<druPurchaseDrugs.size();i++){
            //将单个对象存储到数据库订单表中
            DruPurchaseDrug druPurchaseDrug = druPurchaseDrugs.get(i);
            //设置修改人员
            druPurchaseDrug.setUpdateBy(SecurityUtils.getUsername());
            druPurchaseDrug.setCreateBy(SecurityUtils.getUsername());
            //设置创建时间
            druPurchaseDrug.setCreateTime(new Date());
            druPurchaseDrug.setUpdateTime(new Date());
            //添加到数据库订单表中
            druPurchaseDrugMapper.addWarehousing(druPurchaseDrug);
            //创建了一个订单号和药品编码的中间关系表，储存进去
            druPurchaseDrugMapper.addDrugAndRelation(druPurchaseDrug);
        }
        return 1;
    }


}