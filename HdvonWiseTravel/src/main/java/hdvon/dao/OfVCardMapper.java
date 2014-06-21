package hdvon.dao;

import hdvon.model.OfVCard;

public interface OfVCardMapper {
    int deleteByPrimaryKey(String username);

    int insert(OfVCard record);

    int insertSelective(OfVCard record);

    OfVCard selectByPrimaryKey(String username);

    int updateByPrimaryKeySelective(OfVCard record);

    int updateByPrimaryKeyWithBLOBs(OfVCard record);
}