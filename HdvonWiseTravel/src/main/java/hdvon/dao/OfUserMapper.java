package hdvon.dao;

import hdvon.model.OfUser;

public interface OfUserMapper {
    int deleteByPrimaryKey(String username);

    int insert(OfUser record);

    int insertSelective(OfUser record);

    OfUser selectByPrimaryKey(String username);

    int updateByPrimaryKeySelective(OfUser record);

    int updateByPrimaryKey(OfUser record);
}