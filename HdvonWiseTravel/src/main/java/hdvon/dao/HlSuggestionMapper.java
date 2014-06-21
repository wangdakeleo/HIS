package hdvon.dao;

import hdvon.model.HlSuggestion;

public interface HlSuggestionMapper {
    int insert(HlSuggestion record);

    int insertSelective(HlSuggestion record);
}