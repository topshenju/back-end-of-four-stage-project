package com.ruoyi.project.datastatistics.workloadstatistics.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.framework.web.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @Author Administrator
 * @Date 2021/7/14 20:01
 * @Version 1.0
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Work extends BaseEntity {
  private  Integer registerId;
  private  String doctorNumber;
  private  String doctorName;
  private Integer registerPrice;
  private String patientName;
  @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private Date   seeTime;
  private String createBy;
  @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
   @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
   private Date createTime;
   private String updateBy;
   @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
   @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
   private Date updateTime;
   private String remark;

}
