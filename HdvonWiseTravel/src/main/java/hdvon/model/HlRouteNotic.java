package hdvon.model;

public class HlRouteNotic {
    private String routeid;

    private String noticeid;

    public String getRouteid() {
        return routeid;
    }

    public void setRouteid(String routeid) {
        this.routeid = routeid == null ? null : routeid.trim();
    }

    public String getNoticeid() {
        return noticeid;
    }

    public void setNoticeid(String noticeid) {
        this.noticeid = noticeid == null ? null : noticeid.trim();
    }
}