package hdvon.dao;

import hdvon.model.OfExtComponentConf;

public interface OfExtComponentConfMapper {
    int deleteByPrimaryKey(String subdomain);

    int insert(OfExtComponentConf record);

    int insertSelective(OfExtComponentConf record);

    OfExtComponentConf selectByPrimaryKey(String subdomain);

    int updateByPrimaryKeySelective(OfExtComponentConf record);

    int updateByPrimaryKey(OfExtComponentConf record);
}