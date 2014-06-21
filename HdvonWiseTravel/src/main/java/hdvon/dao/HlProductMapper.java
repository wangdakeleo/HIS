package hdvon.dao;

import hdvon.model.HlProduct;

public interface HlProductMapper {
    int deleteByPrimaryKey(String productid);

    int insert(HlProduct record);

    int insertSelective(HlProduct record);

    HlProduct selectByPrimaryKey(String productid);

    int updateByPrimaryKeySelective(HlProduct record);

    int updateByPrimaryKey(HlProduct record);
}