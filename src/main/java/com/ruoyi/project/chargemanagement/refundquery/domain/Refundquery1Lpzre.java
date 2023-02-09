package com.ruoyi.project.chargemanagement.refundquery.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 4.4退费查询对象 refundquery1_lpzre
 *
 * @author ruoyi
 * @date 2023-02-08
 */
public class Refundquery1Lpzre extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String chargRegId;

    /** 订单号 */
    @Excel(name = "订单号")
    private String presRegId;

    /** $column.columnComment */
    @Excel(name = "订单号")
    private String presPatientName;

    /** 退费金额 */
    @Excel(name = "退费金额")
    private Long refTfmoney;

    /** 退费方式 */
    @Excel(name = "退费方式")
    private String refTfpayment;

    /** 订单状态 */
    @Excel(name = "订单状态")
    private String refStatus;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date refTime;

    /** $column.columnComment */
    @Excel(name = "创建时间")
    private String refCaozuo;

    public void setChargRegId(String chargRegId)
    {
        this.chargRegId = chargRegId;
    }

    public String getChargRegId()
    {
        return chargRegId;
    }
    public void setPresRegId(String presRegId)
    {
        this.presRegId = presRegId;
    }

    public String getPresRegId()
    {
        return presRegId;
    }
    public void setPresPatientName(String presPatientName)
    {
        this.presPatientName = presPatientName;
    }

    public String getPresPatientName()
    {
        return presPatientName;
    }
    public void setRefTfmoney(Long refTfmoney)
    {
        this.refTfmoney = refTfmoney;
    }

    public Long getRefTfmoney()
    {
        return refTfmoney;
    }
    public void setRefTfpayment(String refTfpayment)
    {
        this.refTfpayment = refTfpayment;
    }

    public String getRefTfpayment()
    {
        return refTfpayment;
    }
    public void setRefStatus(String refStatus)
    {
        this.refStatus = refStatus;
    }

    public String getRefStatus()
    {
        return refStatus;
    }
    public void setRefTime(Date refTime)
    {
        this.refTime = refTime;
    }

    public Date getRefTime()
    {
        return refTime;
    }
    public void setRefCaozuo(String refCaozuo)
    {
        this.refCaozuo = refCaozuo;
    }

    public String getRefCaozuo()
    {
        return refCaozuo;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("chargRegId", getChargRegId())
            .append("presRegId", getPresRegId())
            .append("presPatientName", getPresPatientName())
            .append("refTfmoney", getRefTfmoney())
            .append("refTfpayment", getRefTfpayment())
            .append("refStatus", getRefStatus())
            .append("refTime", getRefTime())
            .append("refCaozuo", getRefCaozuo())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("remark", getRemark())
            .append("updateTime", getUpdateTime())
            .append("updateBy", getUpdateBy())
            .toString();
    }
}
