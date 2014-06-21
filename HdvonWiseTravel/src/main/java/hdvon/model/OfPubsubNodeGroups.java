package hdvon.model;

public class OfPubsubNodeGroups {
    private String serviceid;

    private String nodeid;

    private String rostergroup;

    public String getServiceid() {
        return serviceid;
    }

    public void setServiceid(String serviceid) {
        this.serviceid = serviceid == null ? null : serviceid.trim();
    }

    public String getNodeid() {
        return nodeid;
    }

    public void setNodeid(String nodeid) {
        this.nodeid = nodeid == null ? null : nodeid.trim();
    }

    public String getRostergroup() {
        return rostergroup;
    }

    public void setRostergroup(String rostergroup) {
        this.rostergroup = rostergroup == null ? null : rostergroup.trim();
    }
}