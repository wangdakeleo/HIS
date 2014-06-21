package hdvon.model;

public class OfMucRoomProp extends OfMucRoomPropKey {
    private String propvalue;

    public String getPropvalue() {
        return propvalue;
    }

    public void setPropvalue(String propvalue) {
        this.propvalue = propvalue == null ? null : propvalue.trim();
    }
}