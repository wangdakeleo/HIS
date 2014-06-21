package hdvon.dao;

import hdvon.model.HlUserRole;

public interface HlUserRoleMapper {
    int insert(HlUserRole record);

    int insertSelective(HlUserRole record);
}