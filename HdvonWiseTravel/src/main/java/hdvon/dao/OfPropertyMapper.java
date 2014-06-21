package hdvon.dao;

import hdvon.model.OfProperty;

public interface OfPropertyMapper {
    int deleteByPrimaryKey(String name);

    int insert(OfProperty record);

    int insertSelective(OfProperty record);

    OfProperty selectByPrimaryKey(String name);

    int updateByPrimaryKeySelective(OfProperty record);

    int updateByPrimaryKeyWithBLOBs(OfProperty record);
}