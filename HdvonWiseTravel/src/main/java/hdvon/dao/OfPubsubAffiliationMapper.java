package hdvon.dao;

import hdvon.model.OfPubsubAffiliation;
import hdvon.model.OfPubsubAffiliationKey;

public interface OfPubsubAffiliationMapper {
    int deleteByPrimaryKey(OfPubsubAffiliationKey key);

    int insert(OfPubsubAffiliation record);

    int insertSelective(OfPubsubAffiliation record);

    OfPubsubAffiliation selectByPrimaryKey(OfPubsubAffiliationKey key);

    int updateByPrimaryKeySelective(OfPubsubAffiliation record);

    int updateByPrimaryKey(OfPubsubAffiliation record);
}