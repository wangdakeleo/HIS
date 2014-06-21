package hdvon.model;

import java.util.Date;

public class HlNotice {
    private String noticeid;

    private String entid;

    private String noticename;

    private String notictype;

    private String creator;

    private Date createtime;

    private Date lastupdatetime;

    private byte[] content;

    public String getNoticeid() {
        return noticeid;
    }

    public void setNoticeid(String noticeid) {
        this.noticeid = noticeid == null ? null : noticeid.trim();
    }

    public String getEntid() {
        return entid;
    }

    public void setEntid(String entid) {
        this.entid = entid == null ? null : entid.trim();
    }

    public String getNoticename() {
        return noticename;
    }

    public void setNoticename(String noticename) {
        this.noticename = noticename == null ? null : noticename.trim();
    }

    public String getNotictype() {
        return notictype;
    }

    public void setNotictype(String notictype) {
        this.notictype = notictype == null ? null : notictype.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
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

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }
}