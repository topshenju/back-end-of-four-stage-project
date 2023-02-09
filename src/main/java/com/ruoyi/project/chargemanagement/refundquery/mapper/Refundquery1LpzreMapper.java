package com.ruoyi.project.chargemanagement.refundquery.mapper;


import com.ruoyi.project.chargemanagement.refundquery.domain.Refundquery1Lpzre;

import java.util.List;

/**
 * 4.4退费查询Mapper接口
 *
 * @author ruoyi
 * @date 2023-02-08
 */
public interface Refundquery1LpzreMapper
{
    /**
     * 查询4.4退费查询
     *
     * @param chargRegId 4.4退费查询ID
     * @return 4.4退费查询
     */
    public Refundquery1Lpzre selectRefundquery1LpzreById(String chargRegId);

    /**
     * 查询4.4退费查询列表
     *
     * @param refundquery1Lpzre 4.4退费查询
     * @return 4.4退费查询集合
     */
    public List<Refundquery1Lpzre> selectRefundquery1LpzreList(Refundquery1Lpzre refundquery1Lpzre);

    /**
     * 新增4.4退费查询
     *
     * @param refundquery1Lpzre 4.4退费查询
     * @return 结果
     */
    public int insertRefundquery1Lpzre(Refundquery1Lpzre refundquery1Lpzre);

    /**
     * 修改4.4退费查询
     *
     * @param refundquery1Lpzre 4.4退费查询
     * @return 结果
     */
    public int updateRefundquery1Lpzre(Refundquery1Lpzre refundquery1Lpzre);

    /**
     * 删除4.4退费查询
     *
     * @param chargRegId 4.4退费查询ID
     * @return 结果
     */
    public int deleteRefundquery1LpzreById(String chargRegId);

    /**
     * 批量删除4.4退费查询
     *
     * @param chargRegIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteRefundquery1LpzreByIds(String[] chargRegIds);
}
