package hdvon.model;

public class HlSuggestion {
    private String judgeid;

    private Integer roomid;

    private String username;

    private String suggestid;

    private String suggestion;

    public String getJudgeid() {
        return judgeid;
    }

    public void setJudgeid(String judgeid) {
        this.judgeid = judgeid == null ? null : judgeid.trim();
    }

    public Integer getRoomid() {
        return roomid;
    }

    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getSuggestid() {
        return suggestid;
    }

    public void setSuggestid(String suggestid) {
        this.suggestid = suggestid == null ? null : suggestid.trim();
    }

    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion == null ? null : suggestion.trim();
    }
}