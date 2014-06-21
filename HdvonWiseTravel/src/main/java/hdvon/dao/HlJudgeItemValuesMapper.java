package hdvon.dao;

import hdvon.model.HlJudgeItemValues;

public interface HlJudgeItemValuesMapper {
    int deleteByPrimaryKey(String valueid);

    int insert(HlJudgeItemValues record);

    int insertSelective(HlJudgeItemValues record);

    HlJudgeItemValues selectByPrimaryKey(String valueid);

    int updateByPrimaryKeySelective(HlJudgeItemValues record);

    int updateByPrimaryKey(HlJudgeItemValues record);
}