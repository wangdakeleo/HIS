package hdvon.dao;

import hdvon.model.HlJudgeQuestions;

public interface HlJudgeQuestionsMapper {
    int deleteByPrimaryKey(String judgeid);

    int insert(HlJudgeQuestions record);

    int insertSelective(HlJudgeQuestions record);

    HlJudgeQuestions selectByPrimaryKey(String judgeid);

    int updateByPrimaryKeySelective(HlJudgeQuestions record);

    int updateByPrimaryKey(HlJudgeQuestions record);
}