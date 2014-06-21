package hdvon.model;

public class OfPrivacyList extends OfPrivacyListKey {
    private Byte isdefault;

    private String list;

    public Byte getIsdefault() {
        return isdefault;
    }

    public void setIsdefault(Byte isdefault) {
        this.isdefault = isdefault;
    }

    public String getList() {
        return list;
    }

    public void setList(String list) {
        this.list = list == null ? null : list.trim();
    }
}