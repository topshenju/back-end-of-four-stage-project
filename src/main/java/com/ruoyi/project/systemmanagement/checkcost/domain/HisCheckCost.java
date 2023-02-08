package com.ruoyi.project.systemmanagement.checkcost.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.framework.web.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HisCheckCost extends BaseEntity {
    private Long checkId;  //项目费用ID
    private String checkName; //项目名称
    private String checkKeyWord; //关键字
    private String checkPrice; //项目单价
    private String checkCost; //项目成本
    private String checkUnit; //单位
    private String checkCategory; //类别
    private String status;   //状态
    private String createBy;
    /*@DateTimeFormat(pattern = ("yyyy-MM-dd HH-mm-ss"))
    @JsonFormat(pattern = ("yyyy-MM-dd HH-mm-ss"))
    private Date createTime;
    private String updateBy;
    @DateTimeFormat(pattern = ("yyyy-MM-dd HH-mm-ss"))
    @JsonFormat(pattern = ("yyyy-MM-dd HH-mm-ss"))
    private Date updateTime;
    private String remark;*/







}
