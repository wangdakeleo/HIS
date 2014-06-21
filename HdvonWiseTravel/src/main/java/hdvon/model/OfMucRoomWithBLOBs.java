package hdvon.model;

public class OfMucRoomWithBLOBs extends OfMucRoom {
    private byte[] schedule;

    private byte[] circlereport;

    private byte[] tourists;

    public byte[] getSchedule() {
        return schedule;
    }

    public void setSchedule(byte[] schedule) {
        this.schedule = schedule;
    }

    public byte[] getCirclereport() {
        return circlereport;
    }

    public void setCirclereport(byte[] circlereport) {
        this.circlereport = circlereport;
    }

    public byte[] getTourists() {
        return tourists;
    }

    public void setTourists(byte[] tourists) {
        this.tourists = tourists;
    }
}