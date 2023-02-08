package com.ruoyi.project.datastatistics.salesstatistics.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author Administrator
 * @Date 2021/7/14 16:45
 * @Version 1.0
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Drugs {
    private Integer drugId;
    private String drugName;
    private Double drugP;
    private String drugNm;
    private Double drugMax;
    private String createBy;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    private String updateBy;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;
    private String remark;
}
