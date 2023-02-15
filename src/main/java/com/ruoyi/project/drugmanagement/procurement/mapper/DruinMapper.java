package com.ruoyi.project.drugmanagement.procurement.mapper;

import com.ruoyi.project.drugmanagement.procurement.domain.DruDrug;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DruinMapper {

    /**
     * 查询所有的药品类型
     *
     * @return  返回查询结果集合
     */
    List<DruDrug> selectDdType();

    /**
     * 查询所有的处方类型
     *
     * @return  返回查询结果集合
     */
    List<DruDrug> selectPrescriptionType();

    /**完成
     * 根据条件进行数据的查询
     *
     * @param druDrug  用于传查询条件
     * @return  返回查询结果集合
     */
    List<DruDrug> selectList(DruDrug druDrug);

    /**完成
     * 新增药品信息
     *
     * @param druDrug  用来传递药品信息数据
     * @return  返回 1 成功  否则失败
     */
    int addDrug(DruDrug druDrug);

    /**
     * 根据主键查询单条药品信息
     *
     * @return  返回查询到的药品信息对象
     */
    DruDrug selectOne(int ddid);

    /**
     * 修改药品信息
     *
     * @param druDrug  用来传递药品信息数据
     * @return   返回 1 成功  否则失败
     */
    int updateDrug(DruDrug druDrug);

    /**
     * 根据主键删除单条或多条药品信息
     *
     * @param ddids  药品信息主键的数组
     * @return    返回 1 成功  否则失败
     */
    int deleteDrug(@Param("ddids") int[] ddids);




}
