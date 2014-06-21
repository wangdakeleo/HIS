package hdvon.model;

public class OfOffline extends OfOfflineKey {
    private String creationdate;

    private Integer messagesize;

    private String stanza;

    public String getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(String creationdate) {
        this.creationdate = creationdate == null ? null : creationdate.trim();
    }

    public Integer getMessagesize() {
        return messagesize;
    }

    public void setMessagesize(Integer messagesize) {
        this.messagesize = messagesize;
    }

    public String getStanza() {
        return stanza;
    }

    public void setStanza(String stanza) {
        this.stanza = stanza == null ? null : stanza.trim();
    }
}