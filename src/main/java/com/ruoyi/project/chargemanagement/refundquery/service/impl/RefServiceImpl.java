package com.ruoyi.project.chargemanagement.refundquery.service.impl;

import com.ruoyi.project.chargemanagement.refundquery.domain.Ref;
import com.ruoyi.project.chargemanagement.refundquery.mapper.RefMapper;
import com.ruoyi.project.chargemanagement.refundquery.service.IRefService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RefServiceImpl implements IRefService {

    @Autowired
    private RefMapper refMapper;
    @Override
    public List<Ref> FindMoer(Ref ref) {
        return refMapper.selectOne(ref);
    }
}
