package com.ruoyi.project.seedoctor.outpatientservice.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.framework.web.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author Ada
 * @Date 2021/7/15 9:46
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Registered extends BaseEntity {

    //患者ID
    private Integer patientsId;
    //身份证号
    private String idNumber;
    //患者姓名
    private String patientsName;
    //患者电话
    private String patientsPhone;
    //患者年龄
    private Integer patientsAge;
    //患者性别
    private String patientsSex;
    //出生日期
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date birthDate;
    //地址信息
    private String addressInformation;
    //挂号时段
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date periodTime;
    //挂号时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date registrationTime;

}
