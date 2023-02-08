package com.ruoyi.project.datastatistics.workloadstatistics.service;

import com.ruoyi.project.datastatistics.workloadstatistics.domain.Work;

import java.util.List;

/**
 * @Author Administrator
 * @Date 2021/7/14 20:08
 * @Version 1.0
 */
public interface WorkService {
//    查询
    List<Work>  findWork(Work work);
//    修改
    int xiugai(Work work);

//    主键查询
    Work getId(Integer registerId);
//    添加
    int insertWork(Work work);
//    删除
    int  deleteWork(Integer[] registerIds);
}
