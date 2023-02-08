package com.ruoyi.project.seedoctor.doctorscheduling.domain;

import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.BaseEntity;
import io.swagger.models.auth.In;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.Date;
import java.util.List;

/**
 * @author simba@onlying.cn
 * @date 2021/7/14 15:38
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Doctorscheduling extends BaseEntity {

    private Integer doc_id; //医生id
    private String dou_doctor; // 医生
    private String doc_department; //科室
    private int doc_sche; //排班


    private Scheduling scheduling;

}
