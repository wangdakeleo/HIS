package hdvon.model;

public class HlJudgeItemValues {
    private String valueid;

    private String itemid;

    private String content;

    private Long value;

    public String getValueid() {
        return valueid;
    }

    public void setValueid(String valueid) {
        this.valueid = valueid == null ? null : valueid.trim();
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid == null ? null : itemid.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }
}