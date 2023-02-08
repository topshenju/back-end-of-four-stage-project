package com.ruoyi.project.seedoctor.outpatientservice.domain;

import com.ruoyi.framework.web.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author Ada
 * @Date 2021/7/15 19:46
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Charge extends BaseEntity {

    //挂号ID
    private Integer registeredId;
    //科室ID
    private Integer departmentId;
    //科室名称
    private String departmentName;
    //挂号类型
    private String registeredType;
    //挂号时段
    private String registeredPeriod;
    //挂号时间
    private Date registeredTime;
    //当前号数
    private Integer currentNo;

}
