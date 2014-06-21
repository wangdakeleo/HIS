package hdvon.dao;

import hdvon.model.OfMucServiceProp;
import hdvon.model.OfMucServicePropKey;

public interface OfMucServicePropMapper {
    int deleteByPrimaryKey(OfMucServicePropKey key);

    int insert(OfMucServiceProp record);

    int insertSelective(OfMucServiceProp record);

    OfMucServiceProp selectByPrimaryKey(OfMucServicePropKey key);

    int updateByPrimaryKeySelective(OfMucServiceProp record);

    int updateByPrimaryKeyWithBLOBs(OfMucServiceProp record);
}