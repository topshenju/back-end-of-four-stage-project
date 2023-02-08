package com.ruoyi.project.drugmanagement.warehousingaudit.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.framework.web.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author Ada
 * @Date 2021/7/13 16:00
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Drug extends BaseEntity {

    private String documentsId;
    private String supplier;
    private Integer totalPurchase;
    private String status;
    private String applicant;
    private String warehousingOperator;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date storageTime;
    private String createBy;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
    private String updateBy;
    private Date updateTime;
    private String remark;

}
