package hdvon.model;

public class OfMucMember extends OfMucMemberKey {
    private String nickname;

    private String firstname;

    private String lastname;

    private String url;

    private String email;

    private String faqentry;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname == null ? null : firstname.trim();
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname == null ? null : lastname.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getFaqentry() {
        return faqentry;
    }

    public void setFaqentry(String faqentry) {
        this.faqentry = faqentry == null ? null : faqentry.trim();
    }
}