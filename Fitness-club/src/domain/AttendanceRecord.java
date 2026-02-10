package domain;

import java.time.LocalDate;

public class AttendanceRecord {
    private Client client;
    private Workout workout;
    private AttendanceStatus status;
    private LocalDate date;

    public AttendanceRecord(Client client, Workout workout,
                            AttendanceStatus status, LocalDate date) {
        this.client = client;
        this.workout = workout;
        this.status = status;
        this.date = date;
    }

    public Client getClient() {
        return client;
    }

    public Workout getWorkout() {
        return workout;
    }

    public AttendanceStatus getStatus() {
        return status;
    }

    public void setStatus(AttendanceStatus status) {
        this.status = status;
    }

    public LocalDate getDate() {
        return date;
    }


}
