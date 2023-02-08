package com.ruoyi.project.seedoctor.myscheduling.domain;

import com.ruoyi.framework.web.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author simba@onlying.cn
 * @date 2021/7/14 15:38
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Doctorscheduling2 extends BaseEntity {

    private Integer doc_id; //医生id
    private String dou_doctor; // 医生
    private String doc_department; //科室
    private int doc_sche; //排班



}
