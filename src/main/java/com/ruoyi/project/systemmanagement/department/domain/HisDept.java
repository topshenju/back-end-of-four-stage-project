package com.ruoyi.project.systemmanagement.department.domain;

import com.ruoyi.framework.web.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class HisDept  extends BaseEntity {
    private Long deptId;
    private String deptName;
    private String deptCode;
    private long deptNum;
    private String deptLeader;
    private String deptPhone;
    private String status;
}
