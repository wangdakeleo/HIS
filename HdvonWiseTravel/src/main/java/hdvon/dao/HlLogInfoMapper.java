package hdvon.dao;

import hdvon.model.HlLogInfo;

public interface HlLogInfoMapper {
    int deleteByPrimaryKey(String logid);

    int insert(HlLogInfo record);

    int insertSelective(HlLogInfo record);

    HlLogInfo selectByPrimaryKey(String logid);

    int updateByPrimaryKeySelective(HlLogInfo record);

    int updateByPrimaryKey(HlLogInfo record);
}