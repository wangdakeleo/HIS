package hdvon.model;

public class OfMucService {
    private String subdomain;

    private Long serviceid;

    private String description;

    private Byte ishidden;

    public String getSubdomain() {
        return subdomain;
    }

    public void setSubdomain(String subdomain) {
        this.subdomain = subdomain == null ? null : subdomain.trim();
    }

    public Long getServiceid() {
        return serviceid;
    }

    public void setServiceid(Long serviceid) {
        this.serviceid = serviceid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Byte getIshidden() {
        return ishidden;
    }

    public void setIshidden(Byte ishidden) {
        this.ishidden = ishidden;
    }
}