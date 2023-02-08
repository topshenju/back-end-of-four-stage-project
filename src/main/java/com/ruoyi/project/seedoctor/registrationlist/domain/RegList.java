package com.ruoyi.project.seedoctor.registrationlist.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.framework.web.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author Ada
 * @Date 2021/7/15 21:22
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegList extends BaseEntity {

    //患者ID
    private Integer patientsId;
    //患者姓名
    private String patientsName;
    //挂号科室
    private String department;
    //接诊医生
    private String doctor;
    //挂号费用
    private Integer cost;
    //流水编号
    private Integer waterNumber;
    //状态
    private String status;
    //就诊日期
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date clinicDate;
    //挂号类型
    private String registeredType;
    //挂号时段
    private String periodTime;

}
