package hdvon.dao;

import hdvon.model.OfID;

public interface OfIDMapper {
    int deleteByPrimaryKey(Integer idtype);

    int insert(OfID record);

    int insertSelective(OfID record);

    OfID selectByPrimaryKey(Integer idtype);

    int updateByPrimaryKeySelective(OfID record);

    int updateByPrimaryKey(OfID record);
}