package hdvon.dao;

import hdvon.model.OfRoster;

public interface OfRosterMapper {
    int deleteByPrimaryKey(Long rosterid);

    int insert(OfRoster record);

    int insertSelective(OfRoster record);

    OfRoster selectByPrimaryKey(Long rosterid);

    int updateByPrimaryKeySelective(OfRoster record);

    int updateByPrimaryKey(OfRoster record);
}