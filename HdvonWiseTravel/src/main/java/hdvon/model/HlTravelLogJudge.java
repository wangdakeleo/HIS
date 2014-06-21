package hdvon.model;

import java.util.Date;

public class HlTravelLogJudge {
    private String judgeid;

    private String logid;

    private String username;

    private Date lastupdatetime;

    private byte[] judgecontent;

    public String getJudgeid() {
        return judgeid;
    }

    public void setJudgeid(String judgeid) {
        this.judgeid = judgeid == null ? null : judgeid.trim();
    }

    public String getLogid() {
        return logid;
    }

    public void setLogid(String logid) {
        this.logid = logid == null ? null : logid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Date getLastupdatetime() {
        return lastupdatetime;
    }

    public void setLastupdatetime(Date lastupdatetime) {
        this.lastupdatetime = lastupdatetime;
    }

    public byte[] getJudgecontent() {
        return judgecontent;
    }

    public void setJudgecontent(byte[] judgecontent) {
        this.judgecontent = judgecontent;
    }
}