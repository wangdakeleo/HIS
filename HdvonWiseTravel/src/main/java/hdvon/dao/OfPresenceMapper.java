package hdvon.dao;

import hdvon.model.OfPresence;

public interface OfPresenceMapper {
    int deleteByPrimaryKey(String username);

    int insert(OfPresence record);

    int insertSelective(OfPresence record);

    OfPresence selectByPrimaryKey(String username);

    int updateByPrimaryKeySelective(OfPresence record);

    int updateByPrimaryKeyWithBLOBs(OfPresence record);

    int updateByPrimaryKey(OfPresence record);
}