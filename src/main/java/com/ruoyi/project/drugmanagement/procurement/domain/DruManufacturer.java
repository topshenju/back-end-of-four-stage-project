package com.ruoyi.project.drugmanagement.procurement.domain;

import com.ruoyi.framework.web.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class DruManufacturer extends BaseEntity {

    private Integer dmid;  // 厂家ID
    private String dmName;  // 厂家名称
    private String dmCoding;  // 厂家编码
    private String dmContactName;  // 联系人
    private String dmPhone;  // 电话
    private String dmKeyword;  // 关键字
    private String dmState;  // 状态
    private String dmSite;  // 厂家地址

}
