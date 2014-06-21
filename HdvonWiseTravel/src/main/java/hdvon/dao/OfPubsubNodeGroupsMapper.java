package hdvon.dao;

import hdvon.model.OfPubsubNodeGroups;

public interface OfPubsubNodeGroupsMapper {
    int insert(OfPubsubNodeGroups record);

    int insertSelective(OfPubsubNodeGroups record);
}