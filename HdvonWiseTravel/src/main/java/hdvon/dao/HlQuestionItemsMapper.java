package hdvon.dao;

import hdvon.model.HlQuestionItems;

public interface HlQuestionItemsMapper {
    int insert(HlQuestionItems record);

    int insertSelective(HlQuestionItems record);
}