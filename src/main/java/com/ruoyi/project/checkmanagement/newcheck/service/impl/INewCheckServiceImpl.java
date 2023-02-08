package com.ruoyi.project.checkmanagement.newcheck.service.impl;

import com.ruoyi.project.checkmanagement.newcheck.domin.NewCheck;
import com.ruoyi.project.checkmanagement.newcheck.mapper.NewCheckMapper;
import com.ruoyi.project.checkmanagement.newcheck.service.INewCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author yhb
 * @Date 2021/7/13 14:38
 */
@Service
public class INewCheckServiceImpl implements INewCheckService {

    @Autowired
    private NewCheckMapper newCheckMapper;
    /*
    *   新开检查
    * */
    @Override
    public NewCheck findOne(String id) {
        return newCheckMapper.selectOne(id);
    }
}
