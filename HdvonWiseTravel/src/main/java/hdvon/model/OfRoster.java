package hdvon.model;

public class OfRoster {
    private Long rosterid;

    private String username;

    private String jid;

    private Byte sub;

    private Byte ask;

    private Byte recv;

    private String nick;

    public Long getRosterid() {
        return rosterid;
    }

    public void setRosterid(Long rosterid) {
        this.rosterid = rosterid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getJid() {
        return jid;
    }

    public void setJid(String jid) {
        this.jid = jid == null ? null : jid.trim();
    }

    public Byte getSub() {
        return sub;
    }

    public void setSub(Byte sub) {
        this.sub = sub;
    }

    public Byte getAsk() {
        return ask;
    }

    public void setAsk(Byte ask) {
        this.ask = ask;
    }

    public Byte getRecv() {
        return recv;
    }

    public void setRecv(Byte recv) {
        this.recv = recv;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick == null ? null : nick.trim();
    }
}