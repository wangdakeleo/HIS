package hdvon.model;

public class OfMucConversationLogWithBLOBs extends OfMucConversationLog {
    private String sender;

    private String body;

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender == null ? null : sender.trim();
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body == null ? null : body.trim();
    }
}