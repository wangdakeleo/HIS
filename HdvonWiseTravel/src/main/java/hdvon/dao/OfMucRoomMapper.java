package hdvon.dao;

import hdvon.model.OfMucRoom;
import hdvon.model.OfMucRoomKey;
import hdvon.model.OfMucRoomWithBLOBs;

public interface OfMucRoomMapper {
    int deleteByPrimaryKey(OfMucRoomKey key);

    int insert(OfMucRoomWithBLOBs record);

    int insertSelective(OfMucRoomWithBLOBs record);

    OfMucRoomWithBLOBs selectByPrimaryKey(OfMucRoomKey key);

    int updateByPrimaryKeySelective(OfMucRoomWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(OfMucRoomWithBLOBs record);

    int updateByPrimaryKey(OfMucRoom record);
}