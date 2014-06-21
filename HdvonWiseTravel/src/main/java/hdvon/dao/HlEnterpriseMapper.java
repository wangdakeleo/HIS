package hdvon.dao;

import hdvon.model.HlEnterprise;

public interface HlEnterpriseMapper {
    int deleteByPrimaryKey(String entid);

    int insert(HlEnterprise record);

    int insertSelective(HlEnterprise record);

    HlEnterprise selectByPrimaryKey(String entid);

    int updateByPrimaryKeySelective(HlEnterprise record);

    int updateByPrimaryKey(HlEnterprise record);
}