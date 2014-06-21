package hdvon.dao;

import hdvon.model.OfOffline;
import hdvon.model.OfOfflineKey;

public interface OfOfflineMapper {
    int deleteByPrimaryKey(OfOfflineKey key);

    int insert(OfOffline record);

    int insertSelective(OfOffline record);

    OfOffline selectByPrimaryKey(OfOfflineKey key);

    int updateByPrimaryKeySelective(OfOffline record);

    int updateByPrimaryKeyWithBLOBs(OfOffline record);

    int updateByPrimaryKey(OfOffline record);
}