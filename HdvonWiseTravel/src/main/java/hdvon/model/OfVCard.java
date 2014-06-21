package hdvon.model;

public class OfVCard {
    private String username;

    private String vcard;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getVcard() {
        return vcard;
    }

    public void setVcard(String vcard) {
        this.vcard = vcard == null ? null : vcard.trim();
    }
}