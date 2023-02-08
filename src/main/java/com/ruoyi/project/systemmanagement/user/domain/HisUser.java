package com.ruoyi.project.systemmanagement.user.domain;

import com.ruoyi.framework.web.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HisUser extends BaseEntity {
    private Long userId;
    private String userName;
    private String userDepartment;
    private String userPhone;
    private String userSex;
    private String userAge;
    private String userClazz;
    private String userRank;
    private String userPassword;
    private String userRole;
    private String userBackground;
    private String status;


}
