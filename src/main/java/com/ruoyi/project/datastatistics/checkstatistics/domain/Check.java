package com.ruoyi.project.datastatistics.checkstatistics.domain;

import com.ruoyi.framework.web.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author Administrator
 * @Date 2021/7/15 8:41
 * @Version 1.0
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Check extends BaseEntity {
        private Integer projectId;
        private String  projectName;
        private Integer projectPrice;
        private String patientName;
}
