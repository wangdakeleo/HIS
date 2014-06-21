package hdvon.dao;

import hdvon.model.OfPrivate;
import hdvon.model.OfPrivateKey;

public interface OfPrivateMapper {
    int deleteByPrimaryKey(OfPrivateKey key);

    int insert(OfPrivate record);

    int insertSelective(OfPrivate record);

    OfPrivate selectByPrimaryKey(OfPrivateKey key);

    int updateByPrimaryKeySelective(OfPrivate record);

    int updateByPrimaryKeyWithBLOBs(OfPrivate record);
}