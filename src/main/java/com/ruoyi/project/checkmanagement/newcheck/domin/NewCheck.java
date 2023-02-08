package com.ruoyi.project.checkmanagement.newcheck.domin;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author yhb
 * @Date 2021/7/13 14:10
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class NewCheck{
    private String id;
    private String path;
    private String name;
    private String status;
    private String result;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String date;
}
