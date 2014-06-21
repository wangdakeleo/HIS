package hdvon.model;

import java.util.Date;

public class HlRoute {
    private String routeid;

    private String routename;

    private String entid;

    private String description;

    private Byte status;

    private String creator;

    private Date createtime;

    private Date lastupdatetime;

    private String parentid;

    private String routetype;

    private String recommandpath;

    private byte[] recommand;

    public String getRouteid() {
        return routeid;
    }

    public void setRouteid(String routeid) {
        this.routeid = routeid == null ? null : routeid.trim();
    }

    public String getRoutename() {
        return routename;
    }

    public void setRoutename(String routename) {
        this.routename = routename == null ? null : routename.trim();
    }

    public String getEntid() {
        return entid;
    }

    public void setEntid(String entid) {
        this.entid = entid == null ? null : entid.trim();
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

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
    }

    public String getRoutetype() {
        return routetype;
    }

    public void setRoutetype(String routetype) {
        this.routetype = routetype == null ? null : routetype.trim();
    }

    public String getRecommandpath() {
        return recommandpath;
    }

    public void setRecommandpath(String recommandpath) {
        this.recommandpath = recommandpath == null ? null : recommandpath.trim();
    }

    public byte[] getRecommand() {
        return recommand;
    }

    public void setRecommand(byte[] recommand) {
        this.recommand = recommand;
    }
}