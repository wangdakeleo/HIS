package hdvon.dao;

import hdvon.model.OfUserFlag;
import hdvon.model.OfUserFlagKey;

public interface OfUserFlagMapper {
    int deleteByPrimaryKey(OfUserFlagKey key);

    int insert(OfUserFlag record);

    int insertSelective(OfUserFlag record);

    OfUserFlag selectByPrimaryKey(OfUserFlagKey key);

    int updateByPrimaryKeySelective(OfUserFlag record);

    int updateByPrimaryKey(OfUserFlag record);
}