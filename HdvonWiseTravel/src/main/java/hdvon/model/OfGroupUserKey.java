package hdvon.model;

public class OfGroupUserKey {
    private String groupname;

    private String username;

    private Byte administrator;

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname == null ? null : groupname.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Byte getAdministrator() {
        return administrator;
    }

    public void setAdministrator(Byte administrator) {
        this.administrator = administrator;
    }
}