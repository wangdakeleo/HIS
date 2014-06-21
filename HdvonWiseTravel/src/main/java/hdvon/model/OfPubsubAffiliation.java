package hdvon.model;

public class OfPubsubAffiliation extends OfPubsubAffiliationKey {
    private String affiliation;

    public String getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation == null ? null : affiliation.trim();
    }
}