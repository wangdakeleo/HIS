package hdvon.model;

public class HlRouteScenic {
    private String routeid;

    private String scenicid;

    private Integer ordernum;

    public String getRouteid() {
        return routeid;
    }

    public void setRouteid(String routeid) {
        this.routeid = routeid == null ? null : routeid.trim();
    }

    public String getScenicid() {
        return scenicid;
    }

    public void setScenicid(String scenicid) {
        this.scenicid = scenicid == null ? null : scenicid.trim();
    }

    public Integer getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(Integer ordernum) {
        this.ordernum = ordernum;
    }
}