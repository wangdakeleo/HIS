package hdvon.dao;

import hdvon.model.OfMucMember;
import hdvon.model.OfMucMemberKey;

public interface OfMucMemberMapper {
    int deleteByPrimaryKey(OfMucMemberKey key);

    int insert(OfMucMember record);

    int insertSelective(OfMucMember record);

    OfMucMember selectByPrimaryKey(OfMucMemberKey key);

    int updateByPrimaryKeySelective(OfMucMember record);

    int updateByPrimaryKey(OfMucMember record);
}