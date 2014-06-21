package hdvon.dao;

import hdvon.model.OfMucRoomProp;
import hdvon.model.OfMucRoomPropKey;

public interface OfMucRoomPropMapper {
    int deleteByPrimaryKey(OfMucRoomPropKey key);

    int insert(OfMucRoomProp record);

    int insertSelective(OfMucRoomProp record);

    OfMucRoomProp selectByPrimaryKey(OfMucRoomPropKey key);

    int updateByPrimaryKeySelective(OfMucRoomProp record);

    int updateByPrimaryKeyWithBLOBs(OfMucRoomProp record);
}