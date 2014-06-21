package hdvon.dao;

import hdvon.model.HlOrder;

public interface HlOrderMapper {
    int insert(HlOrder record);

    int insertSelective(HlOrder record);
}