package hdvon.dao;

import hdvon.model.OfMucConversationLogWithBLOBs;

public interface OfMucConversationLogMapper {
    int insert(OfMucConversationLogWithBLOBs record);

    int insertSelective(OfMucConversationLogWithBLOBs record);
}