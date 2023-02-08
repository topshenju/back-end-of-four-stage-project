package com.ruoyi.project.systemmanagement.registrationfee.domain;


import com.ruoyi.framework.web.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReGistRationFee extends BaseEntity {
    private Long regisId;
    private String regisName;
    private String regisKeyWord;
    private String status;
}
