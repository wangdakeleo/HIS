package hdvon.model;

import java.util.Date;

public class HlJudgeItems {
    private String itemid;

    private String entid;

    private String itemname;

    private String creator;

    private Date createtime;

    private String judgetype;

    private String temtype;

    private String selecttype;

    private Date lastupdatetime;

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid == null ? null : itemid.trim();
    }

    public String getEntid() {
        return entid;
    }

    public void setEntid(String entid) {
        this.entid = entid == null ? null : entid.trim();
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname == null ? null : itemname.trim();
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

    public String getJudgetype() {
        return judgetype;
    }

    public void setJudgetype(String judgetype) {
        this.judgetype = judgetype == null ? null : judgetype.trim();
    }

    public String getTemtype() {
        return temtype;
    }

    public void setTemtype(String temtype) {
        this.temtype = temtype == null ? null : temtype.trim();
    }

    public String getSelecttype() {
        return selecttype;
    }

    public void setSelecttype(String selecttype) {
        this.selecttype = selecttype == null ? null : selecttype.trim();
    }

    public Date getLastupdatetime() {
        return lastupdatetime;
    }

    public void setLastupdatetime(Date lastupdatetime) {
        this.lastupdatetime = lastupdatetime;
    }
}