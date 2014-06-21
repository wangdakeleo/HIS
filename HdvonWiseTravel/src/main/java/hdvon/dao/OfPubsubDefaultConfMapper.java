package hdvon.dao;

import hdvon.model.OfPubsubDefaultConf;
import hdvon.model.OfPubsubDefaultConfKey;

public interface OfPubsubDefaultConfMapper {
    int deleteByPrimaryKey(OfPubsubDefaultConfKey key);

    int insert(OfPubsubDefaultConf record);

    int insertSelective(OfPubsubDefaultConf record);

    OfPubsubDefaultConf selectByPrimaryKey(OfPubsubDefaultConfKey key);

    int updateByPrimaryKeySelective(OfPubsubDefaultConf record);

    int updateByPrimaryKey(OfPubsubDefaultConf record);
}