package hdvon.dao;

import hdvon.model.HlUserMapInfo;

public interface HlUserMapInfoMapper {
    int deleteByPrimaryKey(String mapid);

    int insert(HlUserMapInfo record);

    int insertSelective(HlUserMapInfo record);

    HlUserMapInfo selectByPrimaryKey(String mapid);

    int updateByPrimaryKeySelective(HlUserMapInfo record);

    int updateByPrimaryKey(HlUserMapInfo record);
}