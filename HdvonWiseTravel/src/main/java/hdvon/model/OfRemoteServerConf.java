package hdvon.model;

public class OfRemoteServerConf {
    private String xmppdomain;

    private Integer remoteport;

    private String permission;

    public String getXmppdomain() {
        return xmppdomain;
    }

    public void setXmppdomain(String xmppdomain) {
        this.xmppdomain = xmppdomain == null ? null : xmppdomain.trim();
    }

    public Integer getRemoteport() {
        return remoteport;
    }

    public void setRemoteport(Integer remoteport) {
        this.remoteport = remoteport;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission == null ? null : permission.trim();
    }
}