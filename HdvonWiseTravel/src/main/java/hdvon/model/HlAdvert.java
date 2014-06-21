package hdvon.model;

import java.util.Date;

public class HlAdvert {
    private String advertid;

    private String businessid;

    private String advertname;

    private String description;

    private Byte status;

    private String creator;

    private Date createtime;

    private Date lastupdatetime;

    private String contentpath;

    private byte[] content;

    public String getAdvertid() {
        return advertid;
    }

    public void setAdvertid(String advertid) {
        this.advertid = advertid == null ? null : advertid.trim();
    }

    public String getBusinessid() {
        return businessid;
    }

    public void setBusinessid(String businessid) {
        this.businessid = businessid == null ? null : businessid.trim();
    }

    public String getAdvertname() {
        return advertname;
    }

    public void setAdvertname(String advertname) {
        this.advertname = advertname == null ? null : advertname.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
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

    public String getContentpath() {
        return contentpath;
    }

    public void setContentpath(String contentpath) {
        this.contentpath = contentpath == null ? null : contentpath.trim();
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }
}