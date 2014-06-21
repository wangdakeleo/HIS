package hdvon.model;

public class OfUserProp extends OfUserPropKey {
    private String propvalue;

    public String getPropvalue() {
        return propvalue;
    }

    public void setPropvalue(String propvalue) {
        this.propvalue = propvalue == null ? null : propvalue.trim();
    }
}