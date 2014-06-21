package hdvon.dao;

import hdvon.model.OfGroup;

public interface OfGroupMapper {
    int deleteByPrimaryKey(String groupname);

    int insert(OfGroup record);

    int insertSelective(OfGroup record);

    OfGroup selectByPrimaryKey(String groupname);

    int updateByPrimaryKeySelective(OfGroup record);

    int updateByPrimaryKey(OfGroup record);
}