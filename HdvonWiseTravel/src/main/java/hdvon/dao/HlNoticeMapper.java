package hdvon.dao;

import hdvon.model.HlNotice;

public interface HlNoticeMapper {
    int deleteByPrimaryKey(String noticeid);

    int insert(HlNotice record);

    int insertSelective(HlNotice record);

    HlNotice selectByPrimaryKey(String noticeid);

    int updateByPrimaryKeySelective(HlNotice record);

    int updateByPrimaryKeyWithBLOBs(HlNotice record);

    int updateByPrimaryKey(HlNotice record);
}