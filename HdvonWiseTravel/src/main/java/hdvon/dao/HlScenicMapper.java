package hdvon.dao;

import hdvon.model.HlScenic;

public interface HlScenicMapper {
    int deleteByPrimaryKey(String scenicid);

    int insert(HlScenic record);

    int insertSelective(HlScenic record);

    HlScenic selectByPrimaryKey(String scenicid);

    int updateByPrimaryKeySelective(HlScenic record);

    int updateByPrimaryKeyWithBLOBs(HlScenic record);

    int updateByPrimaryKey(HlScenic record);
}