package com.ruoyi.project.systemmanagement.user.domain;

import com.ruoyi.framework.web.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HisRole extends BaseEntity {
    private Long rolelId;
    private String userRole;
    private String rolelJurisdiction;
    private String status;
}
