package com.ruoyi.project.chargemanagement.refundquery.service.impl;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.project.chargemanagement.refundquery.domain.Refundquery1Lpzre;
import com.ruoyi.project.chargemanagement.refundquery.mapper.Refundquery1LpzreMapper;
import com.ruoyi.project.chargemanagement.refundquery.service.IRefundquery1LpzreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 4.4退费查询Service业务层处理
 *
 * @author ruoyi
 * @date 2023-02-08
 */
@Service
public class Refundquery1LpzreServiceImpl implements IRefundquery1LpzreService
{
    @Autowired
    private Refundquery1LpzreMapper refundquery1LpzreMapper;

    /**
     * 查询4.4退费查询
     *
     * @param chargRegId 4.4退费查询ID
     * @return 4.4退费查询
     */
    @Override
    public Refundquery1Lpzre selectRefundquery1LpzreById(String chargRegId)
    {
        return refundquery1LpzreMapper.selectRefundquery1LpzreById(chargRegId);
    }

    /**
     * 查询4.4退费查询列表
     *
     * @param refundquery1Lpzre 4.4退费查询
     * @return 4.4退费查询
     */
    @Override
    public List<Refundquery1Lpzre> selectRefundquery1LpzreList(Refundquery1Lpzre refundquery1Lpzre){
        return refundquery1LpzreMapper.selectRefundquery1LpzreList(refundquery1Lpzre);
    }

    /**
     * 新增4.4退费查询
     *
     * @param refundquery1Lpzre 4.4退费查询
     * @return 结果
     */
    @Override
    public int insertRefundquery1Lpzre(Refundquery1Lpzre refundquery1Lpzre)
    {
        refundquery1Lpzre.setCreateTime(DateUtils.getNowDate());
        return refundquery1LpzreMapper.insertRefundquery1Lpzre(refundquery1Lpzre);
    }

    /**
     * 修改4.4退费查询
     *
     * @param refundquery1Lpzre 4.4退费查询
     * @return 结果
     */
    @Override
    public int updateRefundquery1Lpzre(Refundquery1Lpzre refundquery1Lpzre)
    {
        refundquery1Lpzre.setUpdateTime(DateUtils.getNowDate());
        return refundquery1LpzreMapper.updateRefundquery1Lpzre(refundquery1Lpzre);
    }

    /**
     * 批量删除4.4退费查询
     *
     * @param chargRegIds 需要删除的4.4退费查询ID
     * @return 结果
     */
    @Override
    public int deleteRefundquery1LpzreByIds(String[] chargRegIds)
    {
        return refundquery1LpzreMapper.deleteRefundquery1LpzreByIds(chargRegIds);
    }

    /**
     * 删除4.4退费查询信息
     *
     * @param chargRegId 4.4退费查询ID
     * @return 结果
     */
    @Override
    public int deleteRefundquery1LpzreById(String chargRegId)
    {
        return refundquery1LpzreMapper.deleteRefundquery1LpzreById(chargRegId);
    }
}
