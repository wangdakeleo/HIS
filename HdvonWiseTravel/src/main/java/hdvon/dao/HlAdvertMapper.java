package hdvon.dao;

import hdvon.model.HlAdvert;

public interface HlAdvertMapper {
    int deleteByPrimaryKey(String advertid);

    int insert(HlAdvert record);

    int insertSelective(HlAdvert record);

    HlAdvert selectByPrimaryKey(String advertid);

    int updateByPrimaryKeySelective(HlAdvert record);

    int updateByPrimaryKeyWithBLOBs(HlAdvert record);

    int updateByPrimaryKey(HlAdvert record);
}