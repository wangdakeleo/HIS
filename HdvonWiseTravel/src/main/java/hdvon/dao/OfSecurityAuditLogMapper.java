package hdvon.dao;

import hdvon.model.OfSecurityAuditLog;

public interface OfSecurityAuditLogMapper {
    int deleteByPrimaryKey(Long msgid);

    int insert(OfSecurityAuditLog record);

    int insertSelective(OfSecurityAuditLog record);

    OfSecurityAuditLog selectByPrimaryKey(Long msgid);

    int updateByPrimaryKeySelective(OfSecurityAuditLog record);

    int updateByPrimaryKeyWithBLOBs(OfSecurityAuditLog record);

    int updateByPrimaryKey(OfSecurityAuditLog record);
}