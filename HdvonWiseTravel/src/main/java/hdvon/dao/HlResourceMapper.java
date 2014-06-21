package hdvon.dao;

import hdvon.model.HlResource;

public interface HlResourceMapper {
    int deleteByPrimaryKey(String resourceid);

    int insert(HlResource record);

    int insertSelective(HlResource record);

    HlResource selectByPrimaryKey(String resourceid);

    int updateByPrimaryKeySelective(HlResource record);

    int updateByPrimaryKey(HlResource record);
}