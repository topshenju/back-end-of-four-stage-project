package com.ruoyi.project.system.domain;

import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 科室信息对象 his_depts
 * 
 * @author ruoyi
 * @date 2023-02-07
 */
public class HisDepts extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 科室编号 */
    private Long deptsId;

    /** 科室名称 */
    @Excel(name = "科室名称")
    private String deptsName;

    /** 科室编码 */
    @Excel(name = "科室编码")
    private String deptsCode;

    /** 科室挂号量 */
    @Excel(name = "科室挂号量")
    private Long deptsNum;

    /** 科室负责人 */
    @Excel(name = "科室负责人")
    private String deptsLeader;

    /** 电话号码 */
    @Excel(name = "电话号码")
    private String deptsPhone;

    /**部门 */
    @Excel(name = "部门")
    private Long deptId;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String status;

    public void setDeptsId(Long deptsId) 
    {
        this.deptsId = deptsId;
    }

    public Long getDeptsId() 
    {
        return deptsId;
    }
    public void setDeptsName(String deptsName) 
    {
        this.deptsName = deptsName;
    }

    public String getDeptsName() 
    {
        return deptsName;
    }
    public void setDeptsCode(String deptsCode) 
    {
        this.deptsCode = deptsCode;
    }

    public String getDeptsCode() 
    {
        return deptsCode;
    }
    public void setDeptsNum(Long deptsNum) 
    {
        this.deptsNum = deptsNum;
    }

    public Long getDeptsNum() 
    {
        return deptsNum;
    }
    public void setDeptsLeader(String deptsLeader) 
    {
        this.deptsLeader = deptsLeader;
    }

    public String getDeptsLeader() 
    {
        return deptsLeader;
    }
    public void setDeptsPhone(String deptsPhone) 
    {
        this.deptsPhone = deptsPhone;
    }

    public String getDeptsPhone() 
    {
        return deptsPhone;
    }
    public void setDeptId(Long deptId) 
    {
        this.deptId = deptId;
    }

    public Long getDeptId() 
    {
        return deptId;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("deptsId", getDeptsId())
            .append("deptsName", getDeptsName())
            .append("deptsCode", getDeptsCode())
            .append("deptsNum", getDeptsNum())
            .append("deptsLeader", getDeptsLeader())
            .append("deptsPhone", getDeptsPhone())
            .append("deptId", getDeptId())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
