package hdvon.dao;

import hdvon.model.HlRoles;

public interface HlRolesMapper {
    int deleteByPrimaryKey(String roleid);

    int insert(HlRoles record);

    int insertSelective(HlRoles record);

    HlRoles selectByPrimaryKey(String roleid);

    int updateByPrimaryKeySelective(HlRoles record);

    int updateByPrimaryKey(HlRoles record);
}