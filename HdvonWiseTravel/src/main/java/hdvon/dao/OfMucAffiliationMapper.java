package hdvon.dao;

import hdvon.model.OfMucAffiliation;
import hdvon.model.OfMucAffiliationKey;

public interface OfMucAffiliationMapper {
    int deleteByPrimaryKey(OfMucAffiliationKey key);

    int insert(OfMucAffiliation record);

    int insertSelective(OfMucAffiliation record);

    OfMucAffiliation selectByPrimaryKey(OfMucAffiliationKey key);

    int updateByPrimaryKeySelective(OfMucAffiliation record);

    int updateByPrimaryKey(OfMucAffiliation record);
}