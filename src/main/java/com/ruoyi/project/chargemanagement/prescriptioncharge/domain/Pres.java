package com.ruoyi.project.chargemanagement.prescriptioncharge.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.framework.web.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pres extends BaseEntity {
    private static final long serialVersionUID = 1L;

    private String presregid;
    private String yisname;
    private String patientname;
    private String prespatientname;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date presjiuzhentime;

    private String preszhusu;
    private String presxinxi;
    private String presjianyi;

}
