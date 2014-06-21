package hdvon.model;

import java.util.Date;

public class HlPoint {
    private String pointid;

    private String pointname;

    private String scenicid;

    private String entid;

    private String pointdesc;

    private String pointpicture;

    private String mapinfo;

    private Byte status;

    private String creator;

    private Date createtime;

    private Date lastupdatetime;

    private String recomandpath;

    private byte[] recommand;

    public String getPointid() {
        return pointid;
    }

    public void setPointid(String pointid) {
        this.pointid = pointid == null ? null : pointid.trim();
    }

    public String getPointname() {
        return pointname;
    }

    public void setPointname(String pointname) {
        this.pointname = pointname == null ? null : pointname.trim();
    }

    public String getScenicid() {
        return scenicid;
    }

    public void setScenicid(String scenicid) {
        this.scenicid = scenicid == null ? null : scenicid.trim();
    }

    public String getEntid() {
        return entid;
    }

    public void setEntid(String entid) {
        this.entid = entid == null ? null : entid.trim();
    }

    public String getPointdesc() {
        return pointdesc;
    }

    public void setPointdesc(String pointdesc) {
        this.pointdesc = pointdesc == null ? null : pointdesc.trim();
    }

    public String getPointpicture() {
        return pointpicture;
    }

    public void setPointpicture(String pointpicture) {
        this.pointpicture = pointpicture == null ? null : pointpicture.trim();
    }

    public String getMapinfo() {
        return mapinfo;
    }

    public void setMapinfo(String mapinfo) {
        this.mapinfo = mapinfo == null ? null : mapinfo.trim();
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

    public String getRecomandpath() {
        return recomandpath;
    }

    public void setRecomandpath(String recomandpath) {
        this.recomandpath = recomandpath == null ? null : recomandpath.trim();
    }

    public byte[] getRecommand() {
        return recommand;
    }

    public void setRecommand(byte[] recommand) {
        this.recommand = recommand;
    }
}