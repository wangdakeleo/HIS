package hdvon.dao;

import hdvon.model.HlBusiness;

public interface HlBusinessMapper {
    int deleteByPrimaryKey(String businessid);

    int insert(HlBusiness record);

    int insertSelective(HlBusiness record);

    HlBusiness selectByPrimaryKey(String businessid);

    int updateByPrimaryKeySelective(HlBusiness record);

    int updateByPrimaryKey(HlBusiness record);
}