package domain;
import java.util.ArrayList;
import java.util.List;

public class Client {
    private int id;
    private String name;
    private Membership membership;
    private List<AttendanceRecord> attendanceRecords;

    public Client(int id, String name) {
        this.id = id;
        this.name = name;
        this.attendanceRecords = new ArrayList<>();

    }

     public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Membership getMembership() {
        return membership;
    }

    public void setMembership(Membership membership) {
        this.membership = membership;
    }

    public List<AttendanceRecord> getAttendanceRecords() {
        return attendanceRecords;
    }
}
