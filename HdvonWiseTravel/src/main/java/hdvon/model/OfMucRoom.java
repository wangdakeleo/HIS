package hdvon.model;

import java.util.Date;

public class OfMucRoom extends OfMucRoomKey {
    private Long roomid;

    private String creationdate;

    private String modificationdate;

    private String naturalname;

    private String description;

    private String lockeddate;

    private String emptydate;

    private Byte canchangesubject;

    private Integer maxusers;

    private Byte publicroom;

    private Byte moderated;

    private Byte membersonly;

    private Byte caninvite;

    private String roompassword;

    private Byte candiscoverjid;

    private Byte logenabled;

    private String subject;

    private Byte rolestobroadcast;

    private Byte usereservednick;

    private Byte canchangenick;

    private Byte canregister;

    private Integer routeid;

    private String userid;

    private Date begintime;

    private Date endtime;

    private Byte status;

    private String creator;

    private Date createtime;

    private Date lastupdatetime;

    private Date reporttime;

    public Long getRoomid() {
        return roomid;
    }

    public void setRoomid(Long roomid) {
        this.roomid = roomid;
    }

    public String getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(String creationdate) {
        this.creationdate = creationdate == null ? null : creationdate.trim();
    }

    public String getModificationdate() {
        return modificationdate;
    }

    public void setModificationdate(String modificationdate) {
        this.modificationdate = modificationdate == null ? null : modificationdate.trim();
    }

    public String getNaturalname() {
        return naturalname;
    }

    public void setNaturalname(String naturalname) {
        this.naturalname = naturalname == null ? null : naturalname.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getLockeddate() {
        return lockeddate;
    }

    public void setLockeddate(String lockeddate) {
        this.lockeddate = lockeddate == null ? null : lockeddate.trim();
    }

    public String getEmptydate() {
        return emptydate;
    }

    public void setEmptydate(String emptydate) {
        this.emptydate = emptydate == null ? null : emptydate.trim();
    }

    public Byte getCanchangesubject() {
        return canchangesubject;
    }

    public void setCanchangesubject(Byte canchangesubject) {
        this.canchangesubject = canchangesubject;
    }

    public Integer getMaxusers() {
        return maxusers;
    }

    public void setMaxusers(Integer maxusers) {
        this.maxusers = maxusers;
    }

    public Byte getPublicroom() {
        return publicroom;
    }

    public void setPublicroom(Byte publicroom) {
        this.publicroom = publicroom;
    }

    public Byte getModerated() {
        return moderated;
    }

    public void setModerated(Byte moderated) {
        this.moderated = moderated;
    }

    public Byte getMembersonly() {
        return membersonly;
    }

    public void setMembersonly(Byte membersonly) {
        this.membersonly = membersonly;
    }

    public Byte getCaninvite() {
        return caninvite;
    }

    public void setCaninvite(Byte caninvite) {
        this.caninvite = caninvite;
    }

    public String getRoompassword() {
        return roompassword;
    }

    public void setRoompassword(String roompassword) {
        this.roompassword = roompassword == null ? null : roompassword.trim();
    }

    public Byte getCandiscoverjid() {
        return candiscoverjid;
    }

    public void setCandiscoverjid(Byte candiscoverjid) {
        this.candiscoverjid = candiscoverjid;
    }

    public Byte getLogenabled() {
        return logenabled;
    }

    public void setLogenabled(Byte logenabled) {
        this.logenabled = logenabled;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public Byte getRolestobroadcast() {
        return rolestobroadcast;
    }

    public void setRolestobroadcast(Byte rolestobroadcast) {
        this.rolestobroadcast = rolestobroadcast;
    }

    public Byte getUsereservednick() {
        return usereservednick;
    }

    public void setUsereservednick(Byte usereservednick) {
        this.usereservednick = usereservednick;
    }

    public Byte getCanchangenick() {
        return canchangenick;
    }

    public void setCanchangenick(Byte canchangenick) {
        this.canchangenick = canchangenick;
    }

    public Byte getCanregister() {
        return canregister;
    }

    public void setCanregister(Byte canregister) {
        this.canregister = canregister;
    }

    public Integer getRouteid() {
        return routeid;
    }

    public void setRouteid(Integer routeid) {
        this.routeid = routeid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Date getBegintime() {
        return begintime;
    }

    public void setBegintime(Date begintime) {
        this.begintime = begintime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
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

    public Date getReporttime() {
        return reporttime;
    }

    public void setReporttime(Date reporttime) {
        this.reporttime = reporttime;
    }
}