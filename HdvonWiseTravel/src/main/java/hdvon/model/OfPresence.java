package hdvon.model;

public class OfPresence {
    private String username;

    private String offlinedate;

    private String offlinepresence;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getOfflinedate() {
        return offlinedate;
    }

    public void setOfflinedate(String offlinedate) {
        this.offlinedate = offlinedate == null ? null : offlinedate.trim();
    }

    public String getOfflinepresence() {
        return offlinepresence;
    }

    public void setOfflinepresence(String offlinepresence) {
        this.offlinepresence = offlinepresence == null ? null : offlinepresence.trim();
    }
}