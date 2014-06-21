package hdvon.dao;

import hdvon.model.OfPubsubNodeJIDs;
import hdvon.model.OfPubsubNodeJIDsKey;

public interface OfPubsubNodeJIDsMapper {
    int deleteByPrimaryKey(OfPubsubNodeJIDsKey key);

    int insert(OfPubsubNodeJIDs record);

    int insertSelective(OfPubsubNodeJIDs record);

    OfPubsubNodeJIDs selectByPrimaryKey(OfPubsubNodeJIDsKey key);

    int updateByPrimaryKeySelective(OfPubsubNodeJIDs record);

    int updateByPrimaryKey(OfPubsubNodeJIDs record);
}