package hdvon.model;

public class OfRosterGroups extends OfRosterGroupsKey {
    private String groupname;

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname == null ? null : groupname.trim();
    }
}