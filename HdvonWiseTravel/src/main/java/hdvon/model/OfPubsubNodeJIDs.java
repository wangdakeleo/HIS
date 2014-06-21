package hdvon.model;

public class OfPubsubNodeJIDs extends OfPubsubNodeJIDsKey {
    private String associationtype;

    public String getAssociationtype() {
        return associationtype;
    }

    public void setAssociationtype(String associationtype) {
        this.associationtype = associationtype == null ? null : associationtype.trim();
    }
}