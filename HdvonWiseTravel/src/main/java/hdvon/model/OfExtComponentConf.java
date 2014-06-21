package hdvon.model;

public class OfExtComponentConf {
    private String subdomain;

    private Byte wildcard;

    private String secret;

    private String permission;

    public String getSubdomain() {
        return subdomain;
    }

    public void setSubdomain(String subdomain) {
        this.subdomain = subdomain == null ? null : subdomain.trim();
    }

    public Byte getWildcard() {
        return wildcard;
    }

    public void setWildcard(Byte wildcard) {
        this.wildcard = wildcard;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret == null ? null : secret.trim();
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission == null ? null : permission.trim();
    }
}