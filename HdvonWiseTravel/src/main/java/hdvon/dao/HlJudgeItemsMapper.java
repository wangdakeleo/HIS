package hdvon.dao;

import hdvon.model.HlJudgeItems;

public interface HlJudgeItemsMapper {
    int deleteByPrimaryKey(String itemid);

    int insert(HlJudgeItems record);

    int insertSelective(HlJudgeItems record);

    HlJudgeItems selectByPrimaryKey(String itemid);

    int updateByPrimaryKeySelective(HlJudgeItems record);

    int updateByPrimaryKey(HlJudgeItems record);
}