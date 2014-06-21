package hdvon.dao;

import hdvon.model.HlBusinessCouponWithBLOBs;

public interface HlBusinessCouponMapper {
    int insert(HlBusinessCouponWithBLOBs record);

    int insertSelective(HlBusinessCouponWithBLOBs record);
}