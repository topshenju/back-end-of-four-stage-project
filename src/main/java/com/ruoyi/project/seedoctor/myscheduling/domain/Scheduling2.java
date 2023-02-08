package com.ruoyi.project.seedoctor.myscheduling.domain;

import com.ruoyi.framework.web.domain.BaseEntity;
import com.ruoyi.project.seedoctor.doctorscheduling.domain.Doctorscheduling;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author simba@onlying.cn
 * @date 2021/7/15 9:24
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Scheduling2 extends BaseEntity {

    private Integer sche_id; //排班id
    private String sche_time;//时间
    private Date sche_date;//日期
    private String status;//状态


    //医生和科室
    private Doctorscheduling doctorscheduling;

}
