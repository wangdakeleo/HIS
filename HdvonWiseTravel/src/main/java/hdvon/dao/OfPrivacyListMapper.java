package hdvon.dao;

import hdvon.model.OfPrivacyList;
import hdvon.model.OfPrivacyListKey;

public interface OfPrivacyListMapper {
    int deleteByPrimaryKey(OfPrivacyListKey key);

    int insert(OfPrivacyList record);

    int insertSelective(OfPrivacyList record);

    OfPrivacyList selectByPrimaryKey(OfPrivacyListKey key);

    int updateByPrimaryKeySelective(OfPrivacyList record);

    int updateByPrimaryKeyWithBLOBs(OfPrivacyList record);

    int updateByPrimaryKey(OfPrivacyList record);
}