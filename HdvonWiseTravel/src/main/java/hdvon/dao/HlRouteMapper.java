package hdvon.dao;

import hdvon.model.HlRoute;

public interface HlRouteMapper {
    int deleteByPrimaryKey(String routeid);

    int insert(HlRoute record);

    int insertSelective(HlRoute record);

    HlRoute selectByPrimaryKey(String routeid);

    int updateByPrimaryKeySelective(HlRoute record);

    int updateByPrimaryKeyWithBLOBs(HlRoute record);

    int updateByPrimaryKey(HlRoute record);
}