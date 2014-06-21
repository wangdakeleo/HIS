package hdvon.dao;

import hdvon.model.OfPubsubSubscription;
import hdvon.model.OfPubsubSubscriptionKey;

public interface OfPubsubSubscriptionMapper {
    int deleteByPrimaryKey(OfPubsubSubscriptionKey key);

    int insert(OfPubsubSubscription record);

    int insertSelective(OfPubsubSubscription record);

    OfPubsubSubscription selectByPrimaryKey(OfPubsubSubscriptionKey key);

    int updateByPrimaryKeySelective(OfPubsubSubscription record);

    int updateByPrimaryKey(OfPubsubSubscription record);
}