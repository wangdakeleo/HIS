package hdvon.dao;

import hdvon.model.HlTravelLogInfo;

public interface HlTravelLogInfoMapper {
    int deleteByPrimaryKey(String logid);

    int insert(HlTravelLogInfo record);

    int insertSelective(HlTravelLogInfo record);

    HlTravelLogInfo selectByPrimaryKey(String logid);

    int updateByPrimaryKeySelective(HlTravelLogInfo record);

    int updateByPrimaryKeyWithBLOBs(HlTravelLogInfo record);

    int updateByPrimaryKey(HlTravelLogInfo record);
}