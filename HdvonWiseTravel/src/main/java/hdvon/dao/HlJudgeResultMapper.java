package hdvon.dao;

import hdvon.model.HlJudgeResult;

public interface HlJudgeResultMapper {
    int insert(HlJudgeResult record);

    int insertSelective(HlJudgeResult record);
}