package hdvon.model;

import java.util.Date;

public class HlUserMapInfo {
    private String mapid;

    private String mapinfo;

    private Integer roomid;

    private String username;

    private Date createtime;

    private Date lastupdatetime;

    public String getMapid() {
        return mapid;
    }

    public void setMapid(String mapid) {
        this.mapid = mapid == null ? null : mapid.trim();
    }

    public String getMapinfo() {
        return mapinfo;
    }

    public void setMapinfo(String mapinfo) {
        this.mapinfo = mapinfo == null ? null : mapinfo.trim();
    }

    public Integer getRoomid() {
        return roomid;
    }

    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getLastupdatetime() {
        return lastupdatetime;
    }

    public void setLastupdatetime(Date lastupdatetime) {
        this.lastupdatetime = lastupdatetime;
    }
}