package hdvon.model;

import java.util.Date;

public class HlTravelLogInfo {
    private String logid;

    private String logtitle;

    private String username;

    private Integer roomid;

    private Date lastupdatetime;

    private byte[] loginfo;

    public String getLogid() {
        return logid;
    }

    public void setLogid(String logid) {
        this.logid = logid == null ? null : logid.trim();
    }

    public String getLogtitle() {
        return logtitle;
    }

    public void setLogtitle(String logtitle) {
        this.logtitle = logtitle == null ? null : logtitle.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getRoomid() {
        return roomid;
    }

    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    public Date getLastupdatetime() {
        return lastupdatetime;
    }

    public void setLastupdatetime(Date lastupdatetime) {
        this.lastupdatetime = lastupdatetime;
    }

    public byte[] getLoginfo() {
        return loginfo;
    }

    public void setLoginfo(byte[] loginfo) {
        this.loginfo = loginfo;
    }
}