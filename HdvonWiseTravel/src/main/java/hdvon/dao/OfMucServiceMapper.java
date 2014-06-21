package hdvon.dao;

import hdvon.model.OfMucService;

public interface OfMucServiceMapper {
    int deleteByPrimaryKey(String subdomain);

    int insert(OfMucService record);

    int insertSelective(OfMucService record);

    OfMucService selectByPrimaryKey(String subdomain);

    int updateByPrimaryKeySelective(OfMucService record);

    int updateByPrimaryKey(OfMucService record);
}