package com.ruoyi.project.systemmanagement.user.mapper;

import com.ruoyi.project.systemmanagement.user.domain.HisRole;
import com.ruoyi.project.systemmanagement.user.domain.HisUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HisUserMapper {
    List<HisUser> hisListUser(HisUser hisUser);

    int insertUserMapper(HisUser hisUser);

    HisUser UserGetAll(Long userId);

    int updateHisUser(HisUser hisUser);

    int removeHisUser(Long[] userId);

}
