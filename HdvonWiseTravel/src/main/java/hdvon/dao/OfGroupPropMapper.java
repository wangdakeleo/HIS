package hdvon.dao;

import hdvon.model.OfGroupProp;
import hdvon.model.OfGroupPropKey;

public interface OfGroupPropMapper {
    int deleteByPrimaryKey(OfGroupPropKey key);

    int insert(OfGroupProp record);

    int insertSelective(OfGroupProp record);

    OfGroupProp selectByPrimaryKey(OfGroupPropKey key);

    int updateByPrimaryKeySelective(OfGroupProp record);

    int updateByPrimaryKeyWithBLOBs(OfGroupProp record);
}