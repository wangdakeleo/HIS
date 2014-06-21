package hdvon.model;

public class HlBusinessCouponWithBLOBs extends HlBusinessCoupon {
    private byte[] description;

    private byte[] picture;

    public byte[] getDescription() {
        return description;
    }

    public void setDescription(byte[] description) {
        this.description = description;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }
}