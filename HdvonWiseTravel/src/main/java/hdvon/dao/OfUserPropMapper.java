package hdvon.dao;

import hdvon.model.OfUserProp;
import hdvon.model.OfUserPropKey;

public interface OfUserPropMapper {
    int deleteByPrimaryKey(OfUserPropKey key);

    int insert(OfUserProp record);

    int insertSelective(OfUserProp record);

    OfUserProp selectByPrimaryKey(OfUserPropKey key);

    int updateByPrimaryKeySelective(OfUserProp record);

    int updateByPrimaryKeyWithBLOBs(OfUserProp record);
}