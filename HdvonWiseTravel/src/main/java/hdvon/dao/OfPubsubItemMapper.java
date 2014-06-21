package hdvon.dao;

import hdvon.model.OfPubsubItem;
import hdvon.model.OfPubsubItemKey;

public interface OfPubsubItemMapper {
    int deleteByPrimaryKey(OfPubsubItemKey key);

    int insert(OfPubsubItem record);

    int insertSelective(OfPubsubItem record);

    OfPubsubItem selectByPrimaryKey(OfPubsubItemKey key);

    int updateByPrimaryKeySelective(OfPubsubItem record);

    int updateByPrimaryKeyWithBLOBs(OfPubsubItem record);

    int updateByPrimaryKey(OfPubsubItem record);
}