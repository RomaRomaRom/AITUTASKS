package domain;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    private int id;
    private String name;
    private String specialization;
    private List<Workout> workouts;
    private List<Client> clients;

    public Trainer(int id, String name, String specialization) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.workouts = new ArrayList<>();
        this.clients = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public List<Workout> getWorkouts() {
        return workouts;
    }

    public List<Client> getClients() {
        return clients;
    }
}
