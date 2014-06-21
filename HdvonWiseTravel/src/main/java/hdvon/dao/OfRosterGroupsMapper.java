package hdvon.dao;

import hdvon.model.OfRosterGroups;
import hdvon.model.OfRosterGroupsKey;

public interface OfRosterGroupsMapper {
    int deleteByPrimaryKey(OfRosterGroupsKey key);

    int insert(OfRosterGroups record);

    int insertSelective(OfRosterGroups record);

    OfRosterGroups selectByPrimaryKey(OfRosterGroupsKey key);

    int updateByPrimaryKeySelective(OfRosterGroups record);

    int updateByPrimaryKey(OfRosterGroups record);
}