package hdvon.dao;

import hdvon.model.OfSASLAuthorizedKey;

public interface OfSASLAuthorizedMapper {
    int deleteByPrimaryKey(OfSASLAuthorizedKey key);

    int insert(OfSASLAuthorizedKey record);

    int insertSelective(OfSASLAuthorizedKey record);
}