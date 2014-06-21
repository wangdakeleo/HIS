package hdvon.model;

public class OfSecurityAuditLog {
    private Long msgid;

    private String username;

    private Long entrystamp;

    private String summary;

    private String node;

    private String details;

    public Long getMsgid() {
        return msgid;
    }

    public void setMsgid(Long msgid) {
        this.msgid = msgid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Long getEntrystamp() {
        return entrystamp;
    }

    public void setEntrystamp(Long entrystamp) {
        this.entrystamp = entrystamp;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node == null ? null : node.trim();
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details == null ? null : details.trim();
    }
}