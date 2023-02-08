package com.ruoyi.project.checkmanagement.resultentry.service;

import com.ruoyi.project.checkmanagement.resultentry.domin.Resultentry;

import java.util.List;

/**
 * @Author yhb
 * @Date 2021/7/14 8:43
 */
public interface IResultentryService {
    List<Resultentry> findAll(Resultentry resultentry);
}
