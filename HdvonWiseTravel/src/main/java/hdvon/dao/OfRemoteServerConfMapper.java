package hdvon.dao;

import hdvon.model.OfRemoteServerConf;

public interface OfRemoteServerConfMapper {
    int deleteByPrimaryKey(String xmppdomain);

    int insert(OfRemoteServerConf record);

    int insertSelective(OfRemoteServerConf record);

    OfRemoteServerConf selectByPrimaryKey(String xmppdomain);

    int updateByPrimaryKeySelective(OfRemoteServerConf record);

    int updateByPrimaryKey(OfRemoteServerConf record);
}