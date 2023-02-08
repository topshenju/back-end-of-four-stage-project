package com.ruoyi.project.seedoctor.patientlibrary.domain;

import com.ruoyi.framework.web.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.sf.jsqlparser.expression.DateTimeLiteralExpression;

import java.util.Date;

/**
 * @author simba@onlying.cn
 * @date 2021/7/13 16:18
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Patientlibrary extends BaseEntity {

    private Integer sick_Id; //患者id
    private String sick_Name;//患者姓名
    private String sick_Phone;//患者电话
    private String sick_Certificate;//患者身份证号
    private Date sick_Date;//患者出生年月
    private Integer sick_Age;//患者年龄
    private String sick_Sex;//患者性别
    private String sick_Information;//信息状态
    private String sick_Registered;//挂号单id
    private Integer sick_Water;//流水编号
    private String sick_Reg_Type;//挂号类型


}
