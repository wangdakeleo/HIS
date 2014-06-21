package hdvon.model;

public class OfPubsubDefaultConf extends OfPubsubDefaultConfKey {
    private Byte deliverpayloads;

    private Integer maxpayloadsize;

    private Byte persistitems;

    private Integer maxitems;

    private Byte notifyconfigchanges;

    private Byte notifydelete;

    private Byte notifyretract;

    private Byte presencebased;

    private Byte senditemsubscribe;

    private String publishermodel;

    private Byte subscriptionenabled;

    private String accessmodel;

    private String language;

    private String replypolicy;

    private String associationpolicy;

    private Integer maxleafnodes;

    public Byte getDeliverpayloads() {
        return deliverpayloads;
    }

    public void setDeliverpayloads(Byte deliverpayloads) {
        this.deliverpayloads = deliverpayloads;
    }

    public Integer getMaxpayloadsize() {
        return maxpayloadsize;
    }

    public void setMaxpayloadsize(Integer maxpayloadsize) {
        this.maxpayloadsize = maxpayloadsize;
    }

    public Byte getPersistitems() {
        return persistitems;
    }

    public void setPersistitems(Byte persistitems) {
        this.persistitems = persistitems;
    }

    public Integer getMaxitems() {
        return maxitems;
    }

    public void setMaxitems(Integer maxitems) {
        this.maxitems = maxitems;
    }

    public Byte getNotifyconfigchanges() {
        return notifyconfigchanges;
    }

    public void setNotifyconfigchanges(Byte notifyconfigchanges) {
        this.notifyconfigchanges = notifyconfigchanges;
    }

    public Byte getNotifydelete() {
        return notifydelete;
    }

    public void setNotifydelete(Byte notifydelete) {
        this.notifydelete = notifydelete;
    }

    public Byte getNotifyretract() {
        return notifyretract;
    }

    public void setNotifyretract(Byte notifyretract) {
        this.notifyretract = notifyretract;
    }

    public Byte getPresencebased() {
        return presencebased;
    }

    public void setPresencebased(Byte presencebased) {
        this.presencebased = presencebased;
    }

    public Byte getSenditemsubscribe() {
        return senditemsubscribe;
    }

    public void setSenditemsubscribe(Byte senditemsubscribe) {
        this.senditemsubscribe = senditemsubscribe;
    }

    public String getPublishermodel() {
        return publishermodel;
    }

    public void setPublishermodel(String publishermodel) {
        this.publishermodel = publishermodel == null ? null : publishermodel.trim();
    }

    public Byte getSubscriptionenabled() {
        return subscriptionenabled;
    }

    public void setSubscriptionenabled(Byte subscriptionenabled) {
        this.subscriptionenabled = subscriptionenabled;
    }

    public String getAccessmodel() {
        return accessmodel;
    }

    public void setAccessmodel(String accessmodel) {
        this.accessmodel = accessmodel == null ? null : accessmodel.trim();
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public String getReplypolicy() {
        return replypolicy;
    }

    public void setReplypolicy(String replypolicy) {
        this.replypolicy = replypolicy == null ? null : replypolicy.trim();
    }

    public String getAssociationpolicy() {
        return associationpolicy;
    }

    public void setAssociationpolicy(String associationpolicy) {
        this.associationpolicy = associationpolicy == null ? null : associationpolicy.trim();
    }

    public Integer getMaxleafnodes() {
        return maxleafnodes;
    }

    public void setMaxleafnodes(Integer maxleafnodes) {
        this.maxleafnodes = maxleafnodes;
    }
}