package hdvon.model;

import java.util.Date;

public class HlScenic {
    private String scenicid;

    private String scenicname;

    private String entid;

    private String scenicarea;

    private String scenicmap;

    private String mapinfo;

    private Byte status;

    private String creator;

    private Date createtime;

    private Date lastupdatetime;

    private String recommandpath;

    private byte[] recommand;

    public String getScenicid() {
        return scenicid;
    }

    public void setScenicid(String scenicid) {
        this.scenicid = scenicid == null ? null : scenicid.trim();
    }

    public String getScenicname() {
        return scenicname;
    }

    public void setScenicname(String scenicname) {
        this.scenicname = scenicname == null ? null : scenicname.trim();
    }

    public String getEntid() {
        return entid;
    }

    public void setEntid(String entid) {
        this.entid = entid == null ? null : entid.trim();
    }

    public String getScenicarea() {
        return scenicarea;
    }

    public void setScenicarea(String scenicarea) {
        this.scenicarea = scenicarea == null ? null : scenicarea.trim();
    }

    public String getScenicmap() {
        return scenicmap;
    }

    public void setScenicmap(String scenicmap) {
        this.scenicmap = scenicmap == null ? null : scenicmap.trim();
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