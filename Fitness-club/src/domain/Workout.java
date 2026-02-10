package domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Workout {
    private int id;
    private String title;
    private LocalDateTime dateTime;
    private int durationMinutes;
    private int maxParticipants;
    private Trainer trainer;
    private List<Client> participants;

    public Workout(int id, String title, LocalDateTime datetime, int durationMinutes, int maxParticipants, Trainer trainer) {
        this.id = id;
        this.title = title;
        this.dateTime = datetime;
        this.durationMinutes = durationMinutes;
        this.maxParticipants = maxParticipants;
        this.trainer = trainer;
        this.participants = new ArrayList<>(); 
    }

    public int getId() {
            return id;
        }

        public String getTitle() {
            return title;
        }

        public LocalDateTime getDateTime() {
            return dateTime;
        }

        public int getDurationMinutes() {
            return durationMinutes;
        }

        public int getMaxParticipants() {
            return maxParticipants;
        }

        public Trainer getTrainer() {
            return trainer;
        }

        public List<Client> getParticipants() {
            return participants;
        }
}
