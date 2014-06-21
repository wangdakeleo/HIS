package hdvon.dao;

import hdvon.model.HlBaseResourde;

public interface HlBaseResourdeMapper {
    int deleteByPrimaryKey(String resid);

    int insert(HlBaseResourde record);

    int insertSelective(HlBaseResourde record);

    HlBaseResourde selectByPrimaryKey(String resid);

    int updateByPrimaryKeySelective(HlBaseResourde record);

    int updateByPrimaryKey(HlBaseResourde record);
}