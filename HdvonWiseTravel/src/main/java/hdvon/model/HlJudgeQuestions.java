package hdvon.model;

import java.util.Date;

public class HlJudgeQuestions {
    private String judgeid;

    private String entid;

    private String judgename;

    private String description;

    private String creator;

    private Date createtime;

    private Integer status;

    private Date lastupdatetime;

    public String getJudgeid() {
        return judgeid;
    }

    public void setJudgeid(String judgeid) {
        this.judgeid = judgeid == null ? null : judgeid.trim();
    }

    public String getEntid() {
        return entid;
    }

    public void setEntid(String entid) {
        this.entid = entid == null ? null : entid.trim();
    }

    public String getJudgename() {
        return judgename;
    }

    public void setJudgename(String judgename) {
        this.judgename = judgename == null ? null : judgename.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getLastupdatetime() {
        return lastupdatetime;
    }

    public void setLastupdatetime(Date lastupdatetime) {
        this.lastupdatetime = lastupdatetime;
    }
}