package com.ruoyi.project.datastatistics.checkstatistics.service;

import com.ruoyi.project.datastatistics.checkstatistics.domain.Check;

import java.util.List;

/**
 * @Author Administrator
 * @Date 2021/7/15 8:46
 * @Version 1.0
 */
public interface CheckService {
    List<Check>  findCheck(Check check);
}
