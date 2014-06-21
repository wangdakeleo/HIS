package hdvon.dao;

import hdvon.model.HlTravelLogJudge;

public interface HlTravelLogJudgeMapper {
    int deleteByPrimaryKey(String judgeid);

    int insert(HlTravelLogJudge record);

    int insertSelective(HlTravelLogJudge record);

    HlTravelLogJudge selectByPrimaryKey(String judgeid);

    int updateByPrimaryKeySelective(HlTravelLogJudge record);

    int updateByPrimaryKeyWithBLOBs(HlTravelLogJudge record);

    int updateByPrimaryKey(HlTravelLogJudge record);
}