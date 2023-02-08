package com.ruoyi.project.checkmanagement.resultquery.service;

import com.ruoyi.project.checkmanagement.resultentry.domin.Resultentry;
import com.ruoyi.project.checkmanagement.resultquery.domin.Resultquery;

import java.util.List;

/**
 * @Author yhb
 * @Date 2021/7/14 8:43
 */
public interface IResultqueryService {
    List<Resultquery> findAll(Resultquery resultquery);
}
