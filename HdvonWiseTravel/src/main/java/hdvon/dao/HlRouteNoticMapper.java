package hdvon.dao;

import hdvon.model.HlRouteNotic;

public interface HlRouteNoticMapper {
    int insert(HlRouteNotic record);

    int insertSelective(HlRouteNotic record);
}