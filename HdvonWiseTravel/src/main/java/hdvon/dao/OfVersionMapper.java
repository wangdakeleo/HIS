package hdvon.dao;

import hdvon.model.OfVersion;

public interface OfVersionMapper {
    int deleteByPrimaryKey(String name);

    int insert(OfVersion record);

    int insertSelective(OfVersion record);

    OfVersion selectByPrimaryKey(String name);

    int updateByPrimaryKeySelective(OfVersion record);

    int updateByPrimaryKey(OfVersion record);
}