package hdvon.model;

public class OfPubsubNode extends OfPubsubNodeKey {
    private Byte leaf;

    private String creationdate;

    private String modificationdate;

    private String parent;

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

    private Byte configsubscription;

    private String accessmodel;

    private String payloadtype;

    private String bodyxslt;

    private String dataformxslt;

    private String creator;

    private String description;

    private String language;

    private String name;

    private String replypolicy;

    private String associationpolicy;

    private Integer maxleafnodes;

    public Byte getLeaf() {
        return leaf;
    }

    public void setLeaf(Byte leaf) {
        this.leaf = leaf;
    }

    public String getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(String creationdate) {
        this.creationdate = creationdate == null ? null : creationdate.trim();
    }

    public String getModificationdate() {
        return modificationdate;
    }

    public void setModificationdate(String modificationdate) {
        this.modificationdate = modificationdate == null ? null : modificationdate.trim();
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent == null ? null : parent.trim();
    }

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

    public Byte getConfigsubscription() {
        return configsubscription;
    }

    public void setConfigsubscription(Byte configsubscription) {
        this.configsubscription = configsubscription;
    }

    public String getAccessmodel() {
        return accessmodel;
    }

    public void setAccessmodel(String accessmodel) {
        this.accessmodel = accessmodel == null ? null : accessmodel.trim();
    }

    public String getPayloadtype() {
        return payloadtype;
    }

    public void setPayloadtype(String payloadtype) {
        this.payloadtype = payloadtype == null ? null : payloadtype.trim();
    }

    public String getBodyxslt() {
        return bodyxslt;
    }

    public void setBodyxslt(String bodyxslt) {
        this.bodyxslt = bodyxslt == null ? null : bodyxslt.trim();
    }

    public String getDataformxslt() {
        return dataformxslt;
    }

    public void setDataformxslt(String dataformxslt) {
        this.dataformxslt = dataformxslt == null ? null : dataformxslt.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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