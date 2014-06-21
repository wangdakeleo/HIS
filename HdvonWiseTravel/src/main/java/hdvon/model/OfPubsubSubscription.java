package hdvon.model;

public class OfPubsubSubscription extends OfPubsubSubscriptionKey {
    private String jid;

    private String owner;

    private String state;

    private Byte deliver;

    private Byte digest;

    private Integer digestFrequency;

    private String expire;

    private Byte includebody;

    private String showvalues;

    private String subscriptiontype;

    private Byte subscriptiondepth;

    private String keyword;

    public String getJid() {
        return jid;
    }

    public void setJid(String jid) {
        this.jid = jid == null ? null : jid.trim();
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner == null ? null : owner.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Byte getDeliver() {
        return deliver;
    }

    public void setDeliver(Byte deliver) {
        this.deliver = deliver;
    }

    public Byte getDigest() {
        return digest;
    }

    public void setDigest(Byte digest) {
        this.digest = digest;
    }

    public Integer getDigestFrequency() {
        return digestFrequency;
    }

    public void setDigestFrequency(Integer digestFrequency) {
        this.digestFrequency = digestFrequency;
    }

    public String getExpire() {
        return expire;
    }

    public void setExpire(String expire) {
        this.expire = expire == null ? null : expire.trim();
    }

    public Byte getIncludebody() {
        return includebody;
    }

    public void setIncludebody(Byte includebody) {
        this.includebody = includebody;
    }

    public String getShowvalues() {
        return showvalues;
    }

    public void setShowvalues(String showvalues) {
        this.showvalues = showvalues == null ? null : showvalues.trim();
    }

    public String getSubscriptiontype() {
        return subscriptiontype;
    }

    public void setSubscriptiontype(String subscriptiontype) {
        this.subscriptiontype = subscriptiontype == null ? null : subscriptiontype.trim();
    }

    public Byte getSubscriptiondepth() {
        return subscriptiondepth;
    }

    public void setSubscriptiondepth(Byte subscriptiondepth) {
        this.subscriptiondepth = subscriptiondepth;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }
}