package hdvon.dao;

import hdvon.model.OfPubsubNode;
import hdvon.model.OfPubsubNodeKey;

public interface OfPubsubNodeMapper {
    int deleteByPrimaryKey(OfPubsubNodeKey key);

    int insert(OfPubsubNode record);

    int insertSelective(OfPubsubNode record);

    OfPubsubNode selectByPrimaryKey(OfPubsubNodeKey key);

    int updateByPrimaryKeySelective(OfPubsubNode record);

    int updateByPrimaryKey(OfPubsubNode record);
}