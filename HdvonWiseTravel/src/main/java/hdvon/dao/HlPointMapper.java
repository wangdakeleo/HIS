package hdvon.dao;

import hdvon.model.HlPoint;

public interface HlPointMapper {
    int deleteByPrimaryKey(String pointid);

    int insert(HlPoint record);

    int insertSelective(HlPoint record);

    HlPoint selectByPrimaryKey(String pointid);

    int updateByPrimaryKeySelective(HlPoint record);

    int updateByPrimaryKeyWithBLOBs(HlPoint record);

    int updateByPrimaryKey(HlPoint record);
}