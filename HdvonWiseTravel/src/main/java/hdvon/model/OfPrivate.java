package hdvon.model;

public class OfPrivate extends OfPrivateKey {
    private String privatedata;

    public String getPrivatedata() {
        return privatedata;
    }

    public void setPrivatedata(String privatedata) {
        this.privatedata = privatedata == null ? null : privatedata.trim();
    }
}