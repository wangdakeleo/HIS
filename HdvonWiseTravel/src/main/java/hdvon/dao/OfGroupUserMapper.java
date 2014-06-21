package hdvon.dao;

import hdvon.model.OfGroupUserKey;

public interface OfGroupUserMapper {
    int deleteByPrimaryKey(OfGroupUserKey key);

    int insert(OfGroupUserKey record);

    int insertSelective(OfGroupUserKey record);
}